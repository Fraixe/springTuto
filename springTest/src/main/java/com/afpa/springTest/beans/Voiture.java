package com.afpa.springTest.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Lucas
 * POJO avec 4 attributs
 * un id, un nom, un prenom et un prix
 */
@Entity
@Table(name ="t_Voiture")
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	
	@Column(name = "marque")
	private String marque;

	@Column(name = "prix")
	private Integer prix;

	public Voiture() {
	}
	
	public Voiture(Integer id,String name, String marque, Integer prix) {
		this.id = id;
		this.name =name;
		this.marque = marque;
		this.prix = prix;
	}
	
	public Voiture(String name, String marque, Integer prix) {
		this.name =name;
		this.marque = marque;
		this.prix = prix;
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
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the prix
	 */
	public Integer getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Integer prix) {
		this.prix = prix;
	}


}
