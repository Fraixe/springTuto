package com.afpa.springTest.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_personne")
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersonne;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	public Personne() {
	}

	public Personne(Integer id, String nom, String prenom) {
		this.idPersonne = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return the idPersonne
	 */
	public Integer getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
