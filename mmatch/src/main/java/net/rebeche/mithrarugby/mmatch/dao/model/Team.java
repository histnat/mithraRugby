package net.rebeche.mithrarugby.mmatch.dao.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", nullable = false, length = 65535, columnDefinition="TEXT")
	private String name;
	
	@Column(name = "short_name", nullable = false, length = 65535, columnDefinition="TEXT")
	private String shortName;
	
	@Column(name = "adress", nullable = false, length = 65535, columnDefinition="TEXT")
	private String Adress;
	
	@Column(name = "logo", nullable = false, length = 65535, columnDefinition="TEXT")
	private String logo;
	
	@Column(name = "private_comment", nullable = false, length = 65535, columnDefinition="TEXT")
	private String privateComment;
	
	@Column(name = "code", nullable = false, length = 45, columnDefinition="TEXT")
	private String code;
	
	@Column(name = "web_site", nullable = false, length = 65535, columnDefinition="TEXT")
	private String webSite;
	
	@Column(name = "mail", nullable = false, length = 65535, columnDefinition="TEXT")
	private String mail;
	
	@OneToMany(mappedBy="localTeam")
    private Set<Rencontre> localTeams;
	
	@OneToMany(mappedBy="visitorTeam")
    private Set<Rencontre> visitorTeams;

	/**
	 * 
	 */
	public Team() {
		super();
		localTeams = new HashSet<>();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
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
	 * @return the visitorTeams
	 */
	public Set<Rencontre> getVisitorTeams() {
		return visitorTeams;
	}

	/**
	 * @param visitorTeams the visitorTeams to set
	 */
	public void setVisitorTeams(Set<Rencontre> visitorTeams) {
		this.visitorTeams = visitorTeams;
	}

	/**
	 * @return the localTeams
	 */
	public Set<Rencontre> getLocalTeams() {
		return localTeams;
	}

	/**
	 * @param localTeams the localTeams to set
	 */
	public void setLocalTeams(Set<Rencontre> localTeams) {
		this.localTeams = localTeams;
	}

	/**
	 * @return the visitorTeams
	 */
	/*public Set<Rencontre> getVisitorTeams() {
		return visitorTeams;
	}*/

	/**
	 * @param visitorTeams the visitorTeams to set
	 */
	/*public void setVisitorTeams(Set<Rencontre> visitorTeams) {
		this.visitorTeams = visitorTeams;
	}*/

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", shortName=" + shortName + ", Adress=" + Adress + ", logo="
				+ logo + ", privateComment=" + privateComment + ", code=" + code + ", webSite=" + webSite + ", mail="
				+ mail + ", localTeams=" + localTeams + ", visitorTeams=" + visitorTeams + "]";
	}
	
	
	
}
