/**
 * 
 */
package net.rebeche.mithrarugby.mlicence.web.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.rebeche.mithrarugby.mlicence.google.GoogleService;

/**
 * @author frederic.rebeche
 *
 */
@RestController
public class GoogleController {
	
	@Autowired
	GoogleService googleService;
	
	@GetMapping(value="/Google/load")
	public boolean load()
	{
		try {
			return googleService.loadLicence();
		} catch (GeneralSecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * @return the googleService
	 */
	public GoogleService getGoogleService() {
		return googleService;
	}

	/**
	 * @param googleService the googleService to set
	 */
	public void setGoogleService(GoogleService googleService) {
		this.googleService = googleService;
	}
	
	

}
