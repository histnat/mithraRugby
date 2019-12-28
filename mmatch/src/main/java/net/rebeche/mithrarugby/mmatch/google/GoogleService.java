package net.rebeche.mithrarugby.mmatch.google;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

@Service
public class GoogleService extends net.rebeche.mithrarugby.mgoogle.service.GoogleService{
	
	//constante colonne number
	public final static Integer PLACE_NUMBER=0;
	public final static Integer LASTNAME=PLACE_NUMBER+1;
	public final static Integer FIRSTNAME=LASTNAME+1;
	public final static Integer TEAM_NUMBER=FIRSTNAME+1;
	public final static Integer BIRTH_YEAR=TEAM_NUMBER+1;
	public final static Integer LICENCE_NUMBER=BIRTH_YEAR+1;
	public final static Integer COTISATION=LICENCE_NUMBER+1;
	public final static Integer BIRTH_DATE=COTISATION+1;
	public final static Integer STATUS=BIRTH_DATE+1;
	public final static Integer FORMINS=STATUS+1;
	public final static Integer PICTURE_STATUS=FORMINS+1;
	public final static Integer FIRST_LINE=PICTURE_STATUS+1;
	public final static Integer QUALIF_CARD=FIRST_LINE+1;
	public final static Integer PHONE_NUMBER=QUALIF_CARD+1;
	public final static Integer PLAY_NEXT_YEAR=PHONE_NUMBER+1;
	public final static Integer REAFILIATE_ASKING=PLAY_NEXT_YEAR+1;
	public final static Integer MUTATION_VALIDATE=REAFILIATE_ASKING+1;
	public final static Integer MAIL=MUTATION_VALIDATE+1;
	public final static Integer FIRST_COMMENT=MAIL+1;
	public final static Integer SECOND_COMMENT=FIRST_COMMENT+1;
	public final static Integer ORIGINAL_CLUB=SECOND_COMMENT+1;
	public final static Integer SURNAME=ORIGINAL_CLUB+1;
	
	
	

	private Sheets sheetsService;

	private static final String SPREADSHEET_LICENCE_ID = "1Y4lQTCLZoYBThLYcnlTdPwzlI2nSi8W0jsGaeCF-5VE";
	private static final String SPREADSHEET_COMPO_ID = "1mVS6czbTREhq8HKiAEvUxqzfmf3drY2u2hiBaCwGBnk";
	
	public List<List<Object>> getLicence() throws IOException, GeneralSecurityException {
		return getLicence(SPREADSHEET_LICENCE_ID);
	}
	
	public List<List<Object>> getComposition() throws IOException, GeneralSecurityException {
		return getSheet(SPREADSHEET_COMPO_ID,"A1:M83", "M83", "Red Star Retour");
	}

	
}
