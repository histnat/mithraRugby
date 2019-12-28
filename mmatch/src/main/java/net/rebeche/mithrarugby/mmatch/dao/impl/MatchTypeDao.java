package net.rebeche.mithrarugby.mmatch.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.rebeche.mithrarugby.mmatch.dao.model.MatchType;

@Repository
public interface MatchTypeDao extends JpaRepository<MatchType, Integer> {

	MatchType findByCode(String code);


}
