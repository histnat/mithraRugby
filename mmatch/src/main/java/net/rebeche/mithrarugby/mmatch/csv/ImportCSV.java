package net.rebeche.mithrarugby.mmatch.csv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.rebeche.mithrarugby.mmatch.ImportService;
import net.rebeche.mithrarugby.mmatch.dao.DBMatchService;
import net.rebeche.mithrarugby.mmatch.dao.model.MatchType;
import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;
import net.rebeche.mithrarugby.mmatch.dao.model.Team;

@Service("ImportCSV")
public class ImportCSV implements ImportService {
	
	final static String PATH_TEAM_CSV = "init/team.csv";
	final static String PATH_TYPE_CSV = "init/matchtype.csv";
	final static String PATH_MATCH_CSV = "init/match.csv";
	
	final static int TEAM_CODE_INDEX=0;
	final static int TEAM_NAME_INDEX=TEAM_CODE_INDEX+1;
	final static int TEAM_SHORTNAME_INDEX=TEAM_NAME_INDEX+1;
	final static int TEAM_ADDRESS_INDEX=TEAM_SHORTNAME_INDEX+1;
	final static int TEAM_LOGO_INDEX=TEAM_ADDRESS_INDEX+1;
	final static int TEAM_COMMENT_INDEX=TEAM_LOGO_INDEX+1;
	final static int TEAM_WEBSITE_INDEX=TEAM_COMMENT_INDEX+1;
	final static int TEAM_MAIL_INDEX=TEAM_WEBSITE_INDEX+1;
	
	final static int TYPE_CODE_INDEX=0;
	final static int TYPE_NAME_INDEX=TYPE_CODE_INDEX+1;
	
	final static int MATCH_LOCALCODE_INDEX=0;
	final static int MATCH_VISITORCODE_INDEX=MATCH_LOCALCODE_INDEX+1;
	final static int MATCH_DATE_INDEX=MATCH_VISITORCODE_INDEX+1;
	final static int MATCH_LOCALSCORE_INDEX=MATCH_DATE_INDEX+1;
	final static int MATCH_VISITORSCORE_INDEX=MATCH_LOCALSCORE_INDEX+1;
	final static int MATCH_MATCHTYPECODE_INDEX=MATCH_VISITORSCORE_INDEX+1;
	final static int MATCH_ADDRESS_INDEX=MATCH_MATCHTYPECODE_INDEX+1;
	final static int MATCH_RDV_INDEX=MATCH_ADDRESS_INDEX+1;
	final static int MATCH_ALLERRETOUR_INDEX=MATCH_RDV_INDEX+1;
	
	
	@Autowired
	DBMatchService dbMatch;
	
	@Override
	public void importTeam() {
		dbMatch.clearTeam();
		InputStream is = getClass().getClassLoader().getResourceAsStream(PATH_TEAM_CSV);
		CSVParser csvParser=null;
		try {
			csvParser = CSVFormat.EXCEL.withDelimiter('\t').withFirstRecordAsHeader().parse(new InputStreamReader(is));
			
			for (CSVRecord record : csvParser) {
				if(record.size()>=TEAM_MAIL_INDEX)
				{
					Team t = new Team();
					t.setCode(record.get(TEAM_CODE_INDEX));
					t.setName(record.get(TEAM_NAME_INDEX));
					t.setShortName(record.get(TEAM_SHORTNAME_INDEX));
					t.setAdress(record.get(TEAM_ADDRESS_INDEX));
					t.setLogo(record.get(TEAM_LOGO_INDEX));
					t.setPrivateComment(record.get(TEAM_COMMENT_INDEX));
					//web
					t.setWebSite(record.get(TEAM_WEBSITE_INDEX));
					//mail
					t.setMail(record.get(TEAM_MAIL_INDEX));
					System.out.println("team :"+t);
					dbMatch.save(t);
				}
			}			
		} catch (IOException e) {
			
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		}
	}
	
	@Override
	public void importType() {
		dbMatch.clearMatchType();
		InputStream is = getClass().getClassLoader().getResourceAsStream(PATH_TYPE_CSV);
		CSVParser csvParser=null;
		try {
			csvParser = CSVFormat.EXCEL.withDelimiter('\t').withFirstRecordAsHeader().parse(new InputStreamReader(is));
			
			for (CSVRecord record : csvParser) {
				if(record.size()>=TYPE_NAME_INDEX)
				{
					MatchType t = new MatchType();
					t.setCode(record.get(TYPE_CODE_INDEX));
					t.setName(record.get(TYPE_NAME_INDEX));
					dbMatch.save(t);
				}
			}			
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		}
	}

	@Override
	public void importMatch() {
		dbMatch.clearMatch();
		InputStream is = getClass().getClassLoader().getResourceAsStream(PATH_MATCH_CSV);
		CSVParser csvParser=null;
		try {
			csvParser = CSVFormat.EXCEL.withDelimiter('\t').withFirstRecordAsHeader().parse(new InputStreamReader(is));
			
			for (CSVRecord record : csvParser) {
				if(record.size()>=MATCH_ALLERRETOUR_INDEX)
				{
					Rencontre r = new Rencontre();
					Team t = dbMatch.findTeamByCode(record.get(MATCH_LOCALCODE_INDEX));
					r.setLocalTeam(t);
					t = dbMatch.findTeamByCode(record.get(MATCH_VISITORCODE_INDEX));
					r.setVisitorTeam(t);
					//date
					 Date date1=null;
					try {
						date1 = new SimpleDateFormat("dd/MM/yyyy").parse(record.get(MATCH_DATE_INDEX));
					} catch (ParseException e) {
						e.printStackTrace();
					} 
					if(date1!=null)
						r.setDate(new java.sql.Date(date1.getTime()));
					if(!record.get(MATCH_LOCALSCORE_INDEX).isEmpty())
						r.setLocalScore(Integer.parseInt(record.get(MATCH_LOCALSCORE_INDEX)));
					if(!record.get(MATCH_VISITORSCORE_INDEX).isEmpty())
					r.setVisitorScore(Integer.parseInt(record.get(MATCH_VISITORSCORE_INDEX)));
					r.setAddress(record.get(MATCH_ADDRESS_INDEX));
					MatchType mt = dbMatch.findTypeByCode(record.get(MATCH_MATCHTYPECODE_INDEX));
					r.setMatchType(mt);
					
					//t.setMail(record.get(MATCH_RDV_INDEX));
					//r.setAllerRetour(Integer.parseInt(record.get(MATCH_ALLERRETOUR_INDEX)));
					dbMatch.save(r);
				}
			}			
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		}

	}

	@Override
	public void importAll() {
		importTeam();
		importType();
		importMatch();

	}

}
