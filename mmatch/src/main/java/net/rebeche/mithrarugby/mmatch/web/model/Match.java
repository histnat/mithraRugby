package net.rebeche.mithrarugby.mmatch.web.model;

import java.sql.Date;


public class Match {
	
private Integer id;
	
	
	private Team localTeam;
	
	private Team visitorTeam;
	
	private Date date;
	
	private Integer localScore;
	
	private Integer visitorScore;
	
	private String address;
	
	private Date rdv;

	/**
	 * 
	 */
	public Match() {
		super();
		// TODO Auto-generated constructor stub
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

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Match [id=" + id + ", localTeam=" + localTeam + ", visitorTeam=" + visitorTeam + ", date=" + date
				+ ", localScore=" + localScore + ", visitorScore=" + visitorScore + ", address=" + address + ", rdv="
				+ rdv + "]";
	}
	
	

}
