package com.afpa.springTest;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.afpa.springTest.beans.Personne;
import com.afpa.springTest.beans.Ville;
import com.afpa.springTest.beans.Voiture;
import com.afpa.springTest.services.ServicePersonneInterface;
import com.afpa.springTest.services.ServiceVilleInterface;
import com.afpa.springTest.services.ServiceVoitureInterface;
import com.afpa.springTest.servicesImpl.PersonneService;
import com.afpa.springTest.servicesImpl.VoitureService;

/**
 * @author Lucas
 *Classe permettant de charger des données dans la base de données
 */
@Component
@Transactional
public class DataLoader implements ApplicationRunner{

	
	@Autowired
	ServiceVilleInterface vs;
		
	@Autowired
	ServiceVoitureInterface vtS;
	
	@Autowired
	ServicePersonneInterface pS;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		initVille();
		vs.allVille();
		initVoiture();
		vtS.allVoiture();
		
//		Optional<Ville> ville = vs.getVille(1);
//		Ville villeToDelete = ville.get();
//		vs.deleteVille(villeToDelete);
	}

	public void initVille(){
		Ville v1 = vs.addVille(new Ville("Toulouse"));
		Ville v2 = vs.addVille(new Ville("Bordeaux"));
	}
	
	public void initVoiture(){
		Voiture vt1 = vtS.addVoiture(new Voiture("207","Peugeot",25000));
		Voiture vt2 = vtS.addVoiture(new Voiture("4008","Peugeot",50000));
	}
	
	public void initPersonne() {
		Personne p1 = pS.addPersonne(new Personne("Lucas","Griggio"));
	}
	
}
