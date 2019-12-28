package net.rebeche.mithrarugby.mmatch.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.rebeche.mithrarugby.mmatch.dao.DBMatchService;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.helper.DBHelper;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DBMatchServiceTest extends DBHelper {

	@Autowired
	DBMatchService dbMatchService;

	@Before
	public void init() {
		cleanAllMatch();
	}


	@Test
	public void saveMatchTest() {
		List<Rencontre> matchs = new ArrayList<>();
		matchs.add(getMatch(1));
		matchs.add(getMatch(2));
		dbMatchService.saveMatch(matchs);
		List<Rencontre> matchsResult = dbMatchService.getMatchs();
		assertEquals(matchsResult.size(), 2);
		
		cleanAllMatch();
		
		dbMatchService.saveMatch(getMatch(1));
		dbMatchService.saveMatch(getMatch(2));
		matchsResult = dbMatchService.getMatchs();
		assertEquals(matchsResult.size(), 2);
		
	}
	

	
	
}
