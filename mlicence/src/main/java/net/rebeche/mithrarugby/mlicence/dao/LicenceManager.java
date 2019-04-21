package net.rebeche.mithrarugby.mlicence.dao;

import java.sql.Date;

import javax.persistence.Entity;

import net.rebeche.mithrarugby.mlicence.dao.model.CotisationState;
import net.rebeche.mithrarugby.mlicence.dao.model.Licence;

@Entity
public class LicenceManager extends Licence {

	boolean soigneur;
	
	boolean trainer;
	
	boolean dc4;

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param licenceNumber
	 * @param cotisation
	 * @param picture
	 * @param mail
	 * @param carteQualife
	 * @param phoneNumber
	 * @param note
	 * @param soigneur
	 * @param trainer
	 * @param dc4
	 */
	public LicenceManager(int id, String firstName, String lastName, Date birthDate, String licenceNumber,
			CotisationState cotisation, String picture, String mail, String carteQualife, String phoneNumber,
			String note, boolean soigneur, boolean trainer, boolean dc4) {
		super(id, firstName, lastName, birthDate, licenceNumber, cotisation, picture, mail, carteQualife, phoneNumber,
				note);
		this.soigneur = soigneur;
		this.trainer = trainer;
		this.dc4 = dc4;
	}

	/**
	 * 
	 */
	public LicenceManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param licenceNumber
	 * @param cotisation
	 * @param picture
	 * @param mail
	 * @param carteQualife
	 * @param phoneNumber
	 * @param note
	 */
	public LicenceManager(int id, String firstName, String lastName, Date birthDate, String licenceNumber,
			CotisationState cotisation, String picture, String mail, String carteQualife, String phoneNumber,
			String note) {
		super(id, firstName, lastName, birthDate, licenceNumber, cotisation, picture, mail, carteQualife, phoneNumber, note);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the soigneur
	 */
	public boolean isSoigneur() {
		return soigneur;
	}

	/**
	 * @param soigneur the soigneur to set
	 */
	public void setSoigneur(boolean soigneur) {
		this.soigneur = soigneur;
	}

	/**
	 * @return the trainer
	 */
	public boolean isTrainer() {
		return trainer;
	}

	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(boolean trainer) {
		this.trainer = trainer;
	}

	/**
	 * @return the dc4
	 */
	public boolean isDc4() {
		return dc4;
	}

	/**
	 * @param dc4 the dc4 to set
	 */
	public void setDc4(boolean dc4) {
		this.dc4 = dc4;
	}
	
	
}
