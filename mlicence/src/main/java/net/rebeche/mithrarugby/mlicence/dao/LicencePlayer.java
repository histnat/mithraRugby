package net.rebeche.mithrarugby.mlicence.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import net.rebeche.mithrarugby.mlicence.dao.model.CotisationState;
import net.rebeche.mithrarugby.mlicence.dao.model.Licence;

@Entity
public class LicencePlayer extends Licence {

	private int statut;
	
	private boolean formIns;
	
	private boolean pictureState;
	
	private boolean medicalState;
	
	private boolean firstLine;
	
	//@Column( columnDefinition="boolean dafault false")
	private boolean junior;

	/**
	 * @param statut
	 * @param formIns
	 * @param pictureState
	 * @param medicalState
	 * @param firstLine
	 * @param junior
	 */
	public LicencePlayer(int statut, boolean formIns, boolean pictureState, boolean medicalState, boolean firstLine,
			boolean junior) {
		super();
		this.statut = statut;
		this.formIns = formIns;
		this.pictureState = pictureState;
		this.medicalState = medicalState;
		this.firstLine = firstLine;
		this.junior = junior;
	}

	/**
	 * 
	 */
	public LicencePlayer() {
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
	public LicencePlayer(int id, String firstName, String lastName, Date birthDate, String licenceNumber,
			CotisationState cotisation, String picture, String mail, String carteQualife, String phoneNumber,
			String note) {
		super(id, firstName, lastName, birthDate, licenceNumber, cotisation, picture, mail, carteQualife, phoneNumber, note);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the statut
	 */
	public int getStatut() {
		return statut;
	}

	/**
	 * @param statut the statut to set
	 */
	public void setStatut(int statut) {
		this.statut = statut;
	}

	/**
	 * @return the formIns
	 */
	public boolean isFormIns() {
		return formIns;
	}

	/**
	 * @param formIns the formIns to set
	 */
	public void setFormIns(boolean formIns) {
		this.formIns = formIns;
	}

	/**
	 * @return the pictureState
	 */
	public boolean isPictureState() {
		return pictureState;
	}

	/**
	 * @param pictureState the pictureState to set
	 */
	public void setPictureState(boolean pictureState) {
		this.pictureState = pictureState;
	}

	/**
	 * @return the medicalState
	 */
	public boolean isMedicalState() {
		return medicalState;
	}

	/**
	 * @param medicalState the medicalState to set
	 */
	public void setMedicalState(boolean medicalState) {
		this.medicalState = medicalState;
	}

	/**
	 * @return the firstLine
	 */
	public boolean isFirstLine() {
		return firstLine;
	}

	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(boolean firstLine) {
		this.firstLine = firstLine;
	}

	/**
	 * @return the junior
	 */
	public boolean isJunior() {
		return junior;
	}

	/**
	 * @param junior the junior to set
	 */
	public void setJunior(boolean junior) {
		this.junior = junior;
	}
	
	
	
	
}
