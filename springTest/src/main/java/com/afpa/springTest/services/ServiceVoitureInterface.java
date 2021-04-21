package com.afpa.springTest.services;

import com.afpa.springTest.beans.Voiture;

public interface ServiceVoitureInterface {
	
	public Iterable<Voiture> allVoiture();
	
	public Voiture addVoiture(Voiture voiture);

}
