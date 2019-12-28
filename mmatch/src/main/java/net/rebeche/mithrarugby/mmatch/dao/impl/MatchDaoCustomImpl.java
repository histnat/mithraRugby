package net.rebeche.mithrarugby.mmatch.dao.impl;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;

public class MatchDaoCustomImpl implements MatchDaoCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Date> findDistinctDate() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Date> query = cb.createQuery(Date.class);
		Root<Rencontre> rencontre = query.from(Rencontre.class);
		query.select(rencontre.get("date")).distinct(true);
		List<Date> lr = entityManager
				.createQuery(query)
				.getResultList();
		System.out.println(lr);
		return lr;
	}

}
