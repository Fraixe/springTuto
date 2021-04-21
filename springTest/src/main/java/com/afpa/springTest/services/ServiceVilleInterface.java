package com.afpa.springTest.services;

import java.util.Optional;

import com.afpa.springTest.beans.Ville;

public interface ServiceVilleInterface {

	public Iterable<Ville> allVille();
	
	public Ville addVille(Ville ville);
	
	public void deleteVille(Ville ville);
	
	public Optional<Ville> getVille(Integer id);
}
