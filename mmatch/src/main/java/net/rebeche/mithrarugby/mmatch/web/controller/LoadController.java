/**
 * 
 */
package net.rebeche.mithrarugby.mmatch.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.rebeche.mithrarugby.mmatch.ImportService;

/**
 * @author frederic.rebeche
 *
 */
@RestController
public class LoadController {

	@Autowired
	@Qualifier(value = "ImportCSV")
	ImportService importcsv;

	@GetMapping(value = "/Load/csv")
	public ResponseEntity<Boolean> getMatchs() {
		importcsv.importAll();
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	


}
