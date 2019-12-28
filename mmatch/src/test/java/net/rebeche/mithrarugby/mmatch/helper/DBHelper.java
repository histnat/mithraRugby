package net.rebeche.mithrarugby.mmatch.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.rebeche.mithrarugby.mmatch.dao.impl.MatchDao;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;

public class DBHelper {
	
	
	
	@Autowired
	MatchDao matchDao;
	
	protected void cleanAllMatch()
	{
		matchDao.deleteAll();
	}
	
	
	protected Rencontre getMatch(Integer number)
	{
		Rencontre m = new Rencontre();
		m.setAddress("addresse"+number);
		m.setAllerRetour(0);
		return m;
	}
	
	
	protected List<Rencontre> getMatchs(int i) {
		List<Rencontre> llp = new ArrayList<>();
		while(i-->0)
		{
			llp.add(getMatch(i));
		}
		return llp;
	}

}
