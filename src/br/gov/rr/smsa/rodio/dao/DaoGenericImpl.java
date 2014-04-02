package br.gov.rr.smsa.rodio.dao;



import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.internal.SessionImpl;



@SuppressWarnings("unchecked")
public abstract class DaoGenericImpl<T, ID extends Serializable> {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("Rodio_JSF2");
    private EntityManager entityManager = factory.createEntityManager();
    @SuppressWarnings("rawtypes")
	private Class classePersistente;

    @SuppressWarnings("rawtypes")
	public DaoGenericImpl() {
        this.classePersistente = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @SuppressWarnings("rawtypes")
	protected final Class getClassePersistente() {
        return classePersistente;
    }

    public final void refresh(T object) {
        getEntityManager().refresh(object);
    }

    public final void flush() {
        getEntityManager().flush();
    }

    public final void clear() {
        flush();
        getEntityManager().clear();
    }

    public final T merge(T objeto) {
        EntityTransaction transacao = getEntityManager().getTransaction();
        transacao.begin();
		objeto = getEntityManager().merge(objeto);
		transacao.commit();
        return objeto;
    }

    public final void salvar(T objeto) {
        EntityTransaction transacao = getEntityManager().getTransaction();
        try {
            transacao.begin();
            getEntityManager().persist(objeto);
            transacao.commit();
        } catch (Exception e) {
            transacao.rollback();
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public final void remover(T objeto) {
        EntityTransaction transacao = getEntityManager().getTransaction();
        transacao.begin();
        getEntityManager().remove(objeto);
        transacao.commit();
    }

    public final void removerPorChave(Integer chave) {
        getEntityManager().createQuery(
                "delete from " + getClassePersistente().getName()
                + " where id = " + chave).executeUpdate();
    }

    public final T buscarPorChave(Integer chave) {
        T instance = null;
        try {
            instance = (T) getEntityManager().find(getClassePersistente(), chave);
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        return instance;
    }

    @SuppressWarnings("rawtypes")
	public final List buscarPorExemplo(T objeto) {
        Session session = (Session) getEntityManager().getDelegate();
        Example example = criaExemplo(objeto);
        Criteria criteria = session.createCriteria(objeto.getClass()).add(
                example);

        return (List) criteria.list();
    }

    @SuppressWarnings({ "rawtypes", "unused" })
	public final List buscaCriteria() {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery cq = builder.createQuery(getClassePersistente());
        Root rootq = cq.from(getClassePersistente());
        Query query = getEntityManager().createQuery(cq);
        return query.getResultList();
    }

    @SuppressWarnings("rawtypes")
	public final List buscarPorExemplo(T objeto, Integer indiceInicial,
            Integer indiceFinal) {
        Example example = criaExemplo(objeto);
        Criteria criteria = criaCriteria().add(example);
        criteria.setFirstResult(indiceInicial);
        criteria.setMaxResults(indiceFinal);

        return (List) criteria.list();
    }

    public final Long buscaQuantidadeTotal() {
        Criteria criteria = criaCriteria();
        criteria.setProjection(Projections.rowCount());
        return (Long) criteria.uniqueResult();
    }

    @SuppressWarnings("rawtypes")
	public List buscarTodos() {
        List results = null;
        try {
            Query query = getEntityManager().createQuery(
                    "from " + getClassePersistente().getName());
            results = query.getResultList();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        return results;
    }

        @SuppressWarnings("rawtypes")
		public List buscarTodos(String ordem) {
        List results = null;
        try {
            Query query = getEntityManager().createQuery(
                    "from " + getClassePersistente().getName()+" Order by "+ordem);
            results = query.getResultList();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        return results;
    }

    @SuppressWarnings("rawtypes")
	public List buscarTodos(Integer indiceInicial,
            Integer indiceFinal) {
        List results = null;
        try {
            Query query = getEntityManager().createQuery(
                    "from " + getClassePersistente().getName());
            query.setFirstResult(indiceInicial);
            query.setMaxResults(indiceFinal);

            results = (List) query.getResultList();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        return results;
    }

    protected final Criteria criaCriteria() {
        Session session = (Session) getEntityManager().getDelegate();
        return session.createCriteria(getClassePersistente());
    }

    protected final Example criaExemplo(T objeto) {

        Example example = Example.create(objeto);
        example.enableLike(MatchMode.ANYWHERE);
        example.excludeZeroes();
        example.ignoreCase();

        return example;
    }

    public List<T> listPesqParam(String query, Map<String, Object> params) {
        Query q = getEntityManager().createQuery(query);
        for (String chave : params.keySet()) {
            q.setParameter(chave, params.get(chave));
        }
        return q.getResultList();
    }

    public T listPesqParamObject(String query, Map<String, Object> params) {
        Query q = getEntityManager().createQuery(query);
        for (String chave : params.keySet()) {
            q.setParameter(chave, params.get(chave));

        }
        return (T) q.getSingleResult();
    }

    public List<T> listPesq(String query) {
        Query q = getEntityManager().createQuery(query);
        return q.getResultList();
    }
    
    public Connection getConnection(){
    	SessionImpl secaoImpl =  ((SessionImpl) getEntityManager().getDelegate());
    	return  secaoImpl.connection();
    }
    
    
    
	@SuppressWarnings("rawtypes")
	public List list() {
		return (List) criaCriteria().list();
	}
    
}
