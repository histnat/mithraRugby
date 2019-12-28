package net.rebeche.mithrarugby.mmatch.dao.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * type de match : réserve, première, amical, etc...
 * @author frederic.rebeche
 *
 */
@Entity
public class MatchType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", nullable = false, length = 65535, columnDefinition="TEXT")
	private String name;
	
	@Column(name = "code", nullable = false, length = 25, columnDefinition="TEXT")
	private String code;
	
	@OneToMany(mappedBy="matchType")
    private Set<Rencontre> types;

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
	 * @return the types
	 */
	public Set<Rencontre> getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(Set<Rencontre> types) {
		this.types = types;
	}

	/**
	 * @return the types
	 */
	/*public Set<Rencontre> getTypes() {
		return types;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MatchType [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
