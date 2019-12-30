package net.rebeche.mithrarugby.mmatch.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.rebeche.mithrarugby.mmatch.ImportService;
import net.rebeche.mithrarugby.mmatch.dao.DBMatchService;
import net.rebeche.mithrarugby.mmatch.dao.model.MatchType;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.dao.model.Team;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImportCSVTest {

	@Autowired
	@Qualifier(value = "ImportCSV")
	ImportService importcsv;

	@Autowired
	DBMatchService dbMatch;

	

	@Test
	public void importMatchTest() {
		importcsv.importTeam();
		importcsv.importType();
		importcsv.importMatch();
		List<Rencontre> lt = dbMatch.getMatchs();
		assertNotNull(lt);
		assertEquals(lt.size(), 30);
	}

	@Test
	public void importTypeTest() {
		importcsv.importType();
		List<MatchType> lt = dbMatch.getMatchType();
		assertNotNull(lt);
		assertEquals(lt.size(), 3);
	}

	@Test
	public void importTeamTest() {
		importcsv.importTeam();
		List<Team> lt = dbMatch.getTeams();
		assertNotNull(lt);
		assertEquals(lt.size(), 10);
	}

	/**
	 * @return the importcsv
	 */
	public ImportService getImportcsv() {
		return importcsv;
	}

	/**
	 * @param importcsv the importcsv to set
	 */
	public void setImportcsv(ImportService importcsv) {
		this.importcsv = importcsv;
	}

}
