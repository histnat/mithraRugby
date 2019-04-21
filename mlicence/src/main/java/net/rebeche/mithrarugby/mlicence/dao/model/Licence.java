package net.rebeche.mithrarugby.mlicence.dao.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Licence {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
	
	private String licenceNumber;
	
	private CotisationState cotisation;
	
	private String picture;	
	
	private String mail;
	
	private String carteQualife;
	
	private String phoneNumber;
	
	private String note;

	public Licence() {
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
	public Licence(int id, String firstName, String lastName, Date birthDate, String licenceNumber,
			CotisationState cotisation, String picture, String mail, String carteQualife, String phoneNumber,
			String note) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.licenceNumber = licenceNumber;
		this.cotisation = cotisation;
		this.picture = picture;
		this.mail = mail;
		this.carteQualife = carteQualife;
		this.phoneNumber = phoneNumber;
		this.note = note;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the licenceNumber
	 */
	public String getLicenceNumber() {
		return licenceNumber;
	}

	/**
	 * @param licenceNumber the licenceNumber to set
	 */
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	/**
	 * @return the cotisation
	 */
	public CotisationState getCotisation() {
		return cotisation;
	}

	/**
	 * @param cotisation the cotisation to set
	 */
	public void setCotisation(CotisationState cotisation) {
		this.cotisation = cotisation;
	}

	

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the carteQualife
	 */
	public String getCarteQualife() {
		return carteQualife;
	}

	/**
	 * @param carteQualife the carteQualife to set
	 */
	public void setCarteQualife(String carteQualife) {
		this.carteQualife = carteQualife;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	

}
