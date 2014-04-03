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

import br.gov.rr.smsa.rodio.entidades.RodServicos;

public class DaoServicosImpl extends DaoGenericImpl<RodServicos, Serializable> {

	@SuppressWarnings("unchecked")
	public List<RodServicos> lista() {

		CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<RodServicos> cq = builder.createQuery(RodServicos.class);
		cq.from(RodServicos.class);
		Query query = getEntityManager().createQuery(cq);
		List<RodServicos> result = query.getResultList();

		Collections.sort(result, new Comparator<RodServicos>() {

			@Override
			public int compare(RodServicos arg0, RodServicos arg1) {
				return arg0.getDescricao().compareTo(arg1.getDescricao());
			}
		});
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<RodServicos> listaSimples() {

		List<RodServicos> result;
		Criteria c = criaCriteria();
		c.addOrder(Order.asc("descricao"));
		result = c.list();
		return result;
	}
	
	public RodServicos buscaPorId(Integer id){
		
		Criteria c = criaCriteria();
		RodServicos serv;
		c.add(Restrictions.eq("id", id));
		serv = (RodServicos) c.uniqueResult();
		return serv;
		
	}
}
