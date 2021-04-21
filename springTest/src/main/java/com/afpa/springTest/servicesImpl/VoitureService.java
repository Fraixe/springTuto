package com.afpa.springTest.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afpa.springTest.beans.Voiture;
import com.afpa.springTest.repository.VoitureRepository;
import com.afpa.springTest.services.ServiceVoitureInterface;

@Service
public class VoitureService implements ServiceVoitureInterface{

	@Autowired
	VoitureRepository vr;

	@Override
	public Iterable<Voiture> allVoiture() {
		vr.findAll().forEach(voiture -> System.out.println(voiture.getName()));
		return vr.findAll();
	}

	@Override
	public Voiture addVoiture(Voiture voiture) {
		return vr.save(voiture);
	}

}
