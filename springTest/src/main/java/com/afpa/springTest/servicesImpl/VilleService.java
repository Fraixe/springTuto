package com.afpa.springTest.servicesImpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afpa.springTest.beans.Ville;
import com.afpa.springTest.repository.VilleRepository;
import com.afpa.springTest.services.ServiceVilleInterface;

@Service
public class VilleService implements ServiceVilleInterface{

	@Autowired
	VilleRepository vr;

	@Override
	public Iterable<Ville> allVille() {
		vr.findAll().forEach(ville -> System.out.println(ville.getName()));
		return vr.findAll();
	}

	/**
	 * 
	 * @return 
	 */
	@Override
	public Ville addVille(Ville ville) {
		return vr.save(ville);
	}

	@Override
	public void deleteVille(Ville ville) {
		vr.delete(ville);
	}

	@Override
	public Optional<Ville> getVille(Integer id) {
		return vr.findById(id);
	}
}
