package net.rebeche.mithrarugby.mmatch.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.rebeche.mithrarugby.mmatch.dao.model.Team;

@Repository
public interface TeamDao extends JpaRepository<Team, Integer> {

	Team findByCode(String code);


}
