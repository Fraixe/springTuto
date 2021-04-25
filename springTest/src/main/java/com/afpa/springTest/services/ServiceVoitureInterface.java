package com.afpa.springTest.services;

import com.afpa.springTest.beans.Voiture;

/**
 * @author Lucas
 *Interface pour les méthodes utilisées pour manipuler les Voitures
 */
public interface ServiceVoitureInterface {
	
	public Iterable<Voiture> allVoiture();
	
	public Voiture addVoiture(Voiture voiture);

}
