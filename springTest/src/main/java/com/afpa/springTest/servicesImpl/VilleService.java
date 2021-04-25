package com.afpa.springTest.servicesImpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afpa.springTest.beans.Ville;
import com.afpa.springTest.repository.VilleRepository;
import com.afpa.springTest.services.ServiceVilleInterface;



/**
 * @author Lucas
 * Implémentation concrete de l'interface ServiceVilleInterface 
 * permettant de manipuler les villes
 */
@Service
public class VilleService implements ServiceVilleInterface{

	@Autowired
	VilleRepository vr;

	/**
	 * méthode permettant de chercher toutes les villes dans la BDD
	 * @return la liste des villes dans la BDD sous forme Iterable
	 */
	@Override
	public Iterable<Ville> allVille() {
		vr.findAll().forEach(ville -> System.out.println(ville.getName()));
		return vr.findAll();
	}

	/**
	 * Ajoute une ville dans la BDD
	 * @param un objet ville a ajouter dans la BDD
	 * @return une ville qui a été ajouté dans la BDD avec l'ID crée de la BDD
	 */
	@Override
	public Ville addVille(Ville ville) {
		return vr.save(ville);
	}

	/**
	 * Supprime une ville dans la BDD
	 * @param un objet ville a supprimer dans la BDD
	 */
	@Override
	public void deleteVille(Ville ville) {
		vr.delete(ville);
	}

	/**
	 * Récupère une ville dans la BDD via son ID
	 * @param un ID pour chercher une ville dans la BDD
	 * @return un optionnel ville 
	 */
	@Override
	public Optional<Ville> getVille(Integer id) {
		return vr.findById(id);
	}
}
