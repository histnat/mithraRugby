package net.rebeche.mithrarugby.mmatch.dao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rencontre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="localTeam",referencedColumnName="id", nullable=true)
	private Team localTeam;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="visitorTeam",referencedColumnName="id", nullable=true)
	private Team visitorTeam;
	
	private Date date;
	
	private Integer localScore;
	
	private Integer visitorScore;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="matchType",referencedColumnName="id", nullable=true)
	private MatchType matchType;
	
	@Column(name = "address", nullable = false, length = 65535, columnDefinition="TEXT")
	private String address;
	
	private Date rdv;
	
	/**
	 * 0 NA , 1 match aller, 2 match retour
	 */
	private Integer allerRetour;
	
	

	public Rencontre() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	/**
	 * @return the allerRetour
	 */
	public Integer getAllerRetour() {
		return allerRetour;
	}





	/**
	 * @return the matchType
	 */
	public MatchType getMatchType() {
		return matchType;
	}





	/**
	 * @param matchType the matchType to set
	 */
	public void setMatchType(MatchType matchType) {
		this.matchType = matchType;
	}





	/**
	 * @param allerRetour the allerRetour to set
	 */
	public void setAllerRetour(Integer allerRetour) {
		this.allerRetour = allerRetour;
	}





	/**
	 * @return the adress
	 */
	public String getAddress() {
		return address;
	}




	/**
	 * @param adress the adress to set
	 */
	public void setAddress(String adress) {
		this.address = adress;
	}




	/**
	 * @return the rdv
	 */
	public Date getRdv() {
		return rdv;
	}




	/**
	 * @param rdv the rdv to set
	 */
	public void setRdv(Date rdv) {
		this.rdv = rdv;
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
	 * @return the localTeam
	 */
	public Team getLocalTeam() {
		return localTeam;
	}



	/**
	 * @param localTeam the localTeam to set
	 */
	public void setLocalTeam(Team localTeam) {
		this.localTeam = localTeam;
	}



	/**
	 * @return the visitorTeam
	 */
	public Team getVisitorTeam() {
		return visitorTeam;
	}



	/**
	 * @param visitorTeam the visitorTeam to set
	 */
	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}



	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}



	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}



	/**
	 * @return the localScore
	 */
	public Integer getLocalScore() {
		return localScore;
	}



	/**
	 * @param localScore the localScore to set
	 */
	public void setLocalScore(Integer localScore) {
		this.localScore = localScore;
	}



	/**
	 * @return the visitorScore
	 */
	public Integer getVisitorScore() {
		return visitorScore;
	}



	/**
	 * @param visitorScore the visitorScore to set
	 */
	public void setVisitorScore(Integer visitorScore) {
		this.visitorScore = visitorScore;
	}



	




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rencontre [id=" + id + ", localTeam=" + localTeam + ", date=" + date + ", localScore=" + localScore
				+ ", visitorScore=" + visitorScore + ", adress=" + address + ", rdv=" + rdv + ", allerRetour="
				+ allerRetour + "]";
	}

	
	

}
