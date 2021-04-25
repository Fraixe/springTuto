package com.afpa.springTest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afpa.springTest.beans.Personne;
import com.afpa.springTest.repository.PersonneRepository;
import com.afpa.springTest.services.ServicePersonneInterface;

/**
 * @author Lucas
 * Implémentation concrete de l'interface ServicePersonneInterface 
 * permettant de manipuler les personnes
 */
@Service
public class PersonneService implements ServicePersonneInterface{

	@Autowired
	PersonneRepository pr;

	@Override
	public Iterable<Personne> allPersonne() {
		pr.findAll().forEach(personne -> System.out.println(personne.getNom()));
		return pr.findAll();
	}

	@Override
	public Personne addPersonne(Personne personne) {
		return pr.save(personne);
	}
}
