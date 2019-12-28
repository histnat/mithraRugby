package net.rebeche.mithrarugby.mmatch.utils;

import java.util.ArrayList;
import java.util.List;

import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.web.model.Match;
import net.rebeche.mithrarugby.mmatch.web.model.Team;

public class MapperMatch {
	
	public static Match getMatch(Rencontre r)
	{
		Match m = new Match();
		m.setAddress(r.getAddress());
		m.setDate(r.getDate());
		m.setId(r.getId());
		m.setLocalScore(r.getLocalScore());
		m.setLocalTeam(getTeam(r.getLocalTeam()));
		m.setRdv(r.getRdv());
		m.setVisitorScore(r.getVisitorScore());
		m.setVisitorTeam(getTeam(r.getVisitorTeam()));
		return m;
	}

	public static Team getTeam(net.rebeche.mithrarugby.mmatch.dao.model.Team team) {
		Team t = new Team();
		t.setAdress(team.getAdress());
		t.setCode(team.getCode());
		t.setId(team.getId());
		t.setLogo(team.getLogo());
		t.setMail(team.getMail());
		t.setName(team.getName());
		t.setPrivateComment(team.getPrivateComment());
		t.setShortName(team.getShortName());
		t.setWebSite(team.getWebSite());
		return t;
	}
	
	public static List<Match> getMatchs(List<Rencontre> lr)
	{
		List<Match> lm = new ArrayList<>();
		if(lr!=null)
		{
			for(Rencontre r:lr)
			{
				lm.add(getMatch(r));
			}
		}
		return lm;
	}

}
