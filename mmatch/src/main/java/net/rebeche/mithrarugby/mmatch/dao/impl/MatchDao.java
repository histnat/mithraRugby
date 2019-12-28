package net.rebeche.mithrarugby.mmatch.dao.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;

@Repository
public interface MatchDao extends JpaRepository<Rencontre, Integer>,MatchDaoCustom {


}
