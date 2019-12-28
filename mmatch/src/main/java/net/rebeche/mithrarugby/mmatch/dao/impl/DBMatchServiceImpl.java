/**
 * 
 */
package net.rebeche.mithrarugby.mmatch.dao.impl;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.rebeche.mithrarugby.mmatch.dao.DBMatchService;
import net.rebeche.mithrarugby.mmatch.dao.model.MatchType;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.dao.model.Team;

/**
 * @author frederic.rebeche
 *
 */
@Service("DBMatchService")
public class DBMatchServiceImpl implements DBMatchService {

	@Autowired
	MatchDao matchDao;
	
	@Autowired
	TeamDao teamDao;
	
	@Autowired
	MatchTypeDao matchTypeDao;
	
	@Override
	public List<Rencontre> getMatchs() {
		return matchDao.findAll();
	}
	
	@Override
	public List<Date> getMatchDates() {
		List<Date> rencontres=matchDao.findDistinctDate();
		//List<Date> r = rencontres.stream().map(rencontre->rencontre.getDate()).collect(Collectors.toList());
		return rencontres;
	}

	@Override
	public Rencontre getMatchById(Integer id) {
		return matchDao.getOne(id);
	}

	@Override
	public List<Rencontre> saveMatch(List<Rencontre> match) {
		return matchDao.saveAll(match);		
	}

	@Override
	public Rencontre saveMatch(Rencontre match) {
		return matchDao.save(match);		
	}

	@Override
	public List<Team> getTeams() {
		return teamDao.findAll();
	}

	@Override
	public Team getTeamById(Integer id) {
		return teamDao.getOne(id);
	}
	
	@Override
	public Team save(Team team) {
		return teamDao.save(team);		
	}
	
	@Override
	public void clearTeam() {
		teamDao.deleteAll();	
	}

	@Override
	public MatchType save(MatchType t) {
		return matchTypeDao.save(t);
		
	}

	@Override
	public void clearMatchType() {
		matchTypeDao.deleteAll();		
	}
	
	@Override
	public List<MatchType> getMatchType() {
		return matchTypeDao.findAll();
	}

	@Override
	public void clearMatch() {
		matchDao.deleteAll();		
	}

	@Override
	public Team findTeamByCode(String code) {
		return teamDao.findByCode(code);
	}

	@Override
	public MatchType findTypeByCode(String code) {
		return matchTypeDao.findByCode(code);
	}

	@Override
	public Rencontre save(Rencontre r) {
		return matchDao.save(r);
		
	}

}
