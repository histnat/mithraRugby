/**
 * 
 */
package net.rebeche.mithrarugby.mmatch.web.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.rebeche.mithrarugby.mmatch.dao.DBMatchService;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.dao.model.Team;
import net.rebeche.mithrarugby.mmatch.utils.MapperMatch;
import net.rebeche.mithrarugby.mmatch.web.model.Match;

/**
 * @author frederic.rebeche
 *
 */
@RestController
public class MatchController {

	@Autowired
	DBMatchService matchService;
	
	/**
	 * return Each distinct Match's Date
	 * @return
	 */
	@GetMapping(value = "/Match/date")
	public ResponseEntity<List<Date>> getMatchDates() {
		List<Date> result = matchService.getMatchDates();
		return new ResponseEntity<List<Date>>(result, HttpStatus.OK);
	}
	
	

	/*@GetMapping(value = "/Match")
	public ResponseEntity<List<Match>> getMatchs() {
		List<Match> result = MapperMatch.getMatchs(matchService.getMatchs());
		return new ResponseEntity<List<Match>>(result, HttpStatus.OK);
	}*/
	
	@GetMapping(value="/Match")
	public ResponseEntity<List<Match>> getMatchs(@RequestParam Map<String,String> allFilter)
	{
		List<Match> result=new ArrayList<>();
		if(allFilter.isEmpty())
			result = MapperMatch.getMatchs(matchService.getMatchs());
		else
			result = MapperMatch.getMatchs(matchService.getMatchs());
		return new ResponseEntity<List<Match>>(result, HttpStatus.OK);
	}
	
	@GetMapping(value = "/Match/{id}")
	public ResponseEntity<Rencontre> getMatch(@PathVariable Integer id) {
		Rencontre result = matchService.getMatchById(id);
		return new ResponseEntity<Rencontre>(result, HttpStatus.OK);
	}

	@GetMapping(value = "/Team")
	public ResponseEntity<List<Team>> getTeams() {
		List<Team> result = matchService.getTeams();
		return new ResponseEntity<List<Team>>(result, HttpStatus.OK);		
	}

	@GetMapping(value = "/Team/{id}")
	public ResponseEntity<Team> getTeam(@PathVariable Integer id) {
		Team result = matchService.getTeamById(id);
		return new ResponseEntity<Team>(result, HttpStatus.OK);
	}


}
