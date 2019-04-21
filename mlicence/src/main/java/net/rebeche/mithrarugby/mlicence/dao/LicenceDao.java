package net.rebeche.mithrarugby.mlicence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.rebeche.mithrarugby.mlicence.dao.model.Licence;

@Repository
public interface LicenceDao extends JpaRepository<Licence, Integer> {

}
