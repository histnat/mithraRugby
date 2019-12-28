package net.rebeche.mithrarugby.mmatch.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import net.rebeche.mithrarugby.mmatch.dao.model.MatchType;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.dao.model.Team;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;

public interface DBMatchService {

	/**
	 * return all the match
	 * @return
	 */
	List<Rencontre> getMatchs();

	/**
	 * return match with id 
	 * @param id
	 * @return
	 */
	Rencontre getMatchById(Integer id);
	
	/**
	 * save Match list
	 * @param matchs
	 * @return 
	 */
	List<Rencontre> saveMatch(List<Rencontre> matchs);
	
	/**
	 * save match
	 * @param match
	 * @return 
	 */
	Rencontre saveMatch(Rencontre match);

	/**
	 * return all the teams
	 * @return
	 */
	List<Team> getTeams();

	/**
	 * return team with id
	 * @param id
	 * @return
	 */
	Team getTeamById(Integer id);

	/**
	 * save team
	 * @param t
	 * @return
	 */
	Team save(Team t);

	/**
	 * delete all team
	 */
	void clearTeam();

	/**
	 * Save matchType
	 * @param t
	 * @return 
	 */
	MatchType save(MatchType t);
	
	/**
	 * delete all team
	 */
	void clearMatchType();

	/**
	 * get all MatchType
	 * @return
	 */
	List<MatchType> getMatchType();

	/**
	 * Clear all matchType
	 */
	void clearMatch();

	/**
	 * find team by code
	 * @param string
	 * @return
	 */
	Team findTeamByCode(String string);

	/**
	 * 
	 * @param string
	 * @return
	 */
	MatchType findTypeByCode(String string);

	/**
	 * 
	 * @param r
	 * @return 
	 */
	Rencontre save(Rencontre r);

	/**
	 * return each distinct Match's date
	 * @return
	 */
	List<Date> getMatchDates();

	


	
	
	

}
