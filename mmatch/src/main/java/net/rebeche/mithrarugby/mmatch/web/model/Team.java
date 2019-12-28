package net.rebeche.mithrarugby.mmatch.web.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import net.rebeche.mithrarugby.mmatch.dao.model.Rencontre;

public class Team {
	private Integer id;
	
	private String name;
	
	private String shortName;
	
	private String Adress;
	
	private String logo;
	
	private String privateComment;
	
	private String code;
	
	private String webSite;
	
	private String mail;

	
	
	/**
	 * 
	 */
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param id
	 * @param name
	 * @param shortName
	 * @param adress
	 * @param logo
	 * @param privateComment
	 * @param code
	 * @param webSite
	 * @param mail
	 */
	public Team(Integer id, String name, String shortName, String adress, String logo, String privateComment,
			String code, String webSite, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		Adress = adress;
		this.logo = logo;
		this.privateComment = privateComment;
		this.code = code;
		this.webSite = webSite;
		this.mail = mail;
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}



	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}



	/**
	 * @return the adress
	 */
	public String getAdress() {
		return Adress;
	}



	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		Adress = adress;
	}



	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}



	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}



	/**
	 * @return the privateComment
	 */
	public String getPrivateComment() {
		return privateComment;
	}



	/**
	 * @param privateComment the privateComment to set
	 */
	public void setPrivateComment(String privateComment) {
		this.privateComment = privateComment;
	}



	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}



	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}



	/**
	 * @return the webSite
	 */
	public String getWebSite() {
		return webSite;
	}



	/**
	 * @param webSite the webSite to set
	 */
	public void setWebSite(String webSite) {
		this.webSite = webSite;
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



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", shortName=" + shortName + ", Adress=" + Adress + ", logo="
				+ logo + ", privateComment=" + privateComment + ", code=" + code + ", webSite=" + webSite + ", mail="
				+ mail + "]";
	}
	
	
	
}
