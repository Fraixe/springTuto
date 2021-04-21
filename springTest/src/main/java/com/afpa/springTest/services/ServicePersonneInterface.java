package com.afpa.springTest.services;

import com.afpa.springTest.beans.Personne;

public interface ServicePersonneInterface {

	public Iterable<Personne> allPersonne();
	
	public Personne addPersonne(Personne personne);
}
