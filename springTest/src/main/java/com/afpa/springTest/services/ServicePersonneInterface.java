package com.afpa.springTest.services;

import com.afpa.springTest.beans.Personne;

/**
 * @author Lucas
 *Interface pour les méthodes utilisées pour manipuler les personnes
 */
public interface ServicePersonneInterface {

	public Iterable<Personne> allPersonne();
	
	public Personne addPersonne(Personne personne);
}
