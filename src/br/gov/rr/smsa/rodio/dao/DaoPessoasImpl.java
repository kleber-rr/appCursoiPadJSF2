package br.gov.rr.smsa.rodio.dao;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.gov.rr.smsa.rodio.entidades.Pessoa;

public class DaoPessoasImpl extends DaoGenericImpl<Pessoa, Serializable> {

	@SuppressWarnings("unchecked")
	public List<Pessoa> lista() {

		CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = builder.createQuery(Pessoa.class);
		cq.from(Pessoa.class);
		Query query = getEntityManager().createQuery(cq);
		List<Pessoa> result = query.getResultList();

		Collections.sort(result, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa arg0, Pessoa arg1) {
				return arg0.getNome().compareTo(arg1.getNome());
			}
		});
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> listaSimples() {

		List<Pessoa> result;
		Criteria c = criaCriteria();
		c.addOrder(Order.asc("nome"));
		result = c.list();
		return result;
	}
	
	public Pessoa buscaPorId(Integer id){
		
		Criteria c = criaCriteria();
		Pessoa serv;
		c.add(Restrictions.eq("id", id));
		serv = (Pessoa) c.uniqueResult();
		return serv;
		
	}
}
