package com.afpa.springTest.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afpa.springTest.beans.Personne;
import com.afpa.springTest.beans.Ville;
import com.afpa.springTest.beans.Voiture;
import com.afpa.springTest.repository.PersonneRepository;
import com.afpa.springTest.repository.VilleRepository;
import com.afpa.springTest.repository.VoitureRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Lucas
 *Controlleur utilisé pour un REST service sur ville, voiture, personne
 *exposant des méthodes CRUD
 */
@Api(description="API pour es opérations CRUD sur les villes, voitures, personnes.")
@RestController
@RequestMapping("/api")
public class APIControlleur {

	@Autowired
	private VilleRepository villeRepo;
	@Autowired
	private VoitureRepository voitureRepo;
	@Autowired
	private PersonneRepository personneRepo;
	
	@ApiOperation(value = "Récupère toutes les villes")
	@GetMapping("/allVille")
	public List<Ville> allVille(){
		return (List<Ville>) villeRepo.findAll();
	}
	
	@ApiOperation(value = "Ajoute une ville dans la base de données")
	@PutMapping("/addVille")
	public void addVille(@RequestBody Ville ville) {
		villeRepo.save(ville);
		System.out.println(ville.getName() + "ajoutée !");
	}
	
	@ApiOperation(value = "Modifie le nom d'une ville dans la base de données")
	@PostMapping("/updateVille")
	public void updateVille(@RequestBody Ville ville) {
		Optional<Ville> OptionalVilleToModif = villeRepo.findById(ville.getId());
		Ville villeToModif = OptionalVilleToModif.get();
		villeToModif.setName(ville.getName());
		villeRepo.save(villeToModif);
		System.out.println("Ville update !");
	}
	
	@ApiOperation(value = "Supprime une ville dans la base de données")
	@DeleteMapping("/deleteVille")
	public void deleteVille(@RequestBody Ville ville) {
		Optional<Ville> OptionalVilleToDel = villeRepo.findById(ville.getId());
		try {
			Ville villeToDel = OptionalVilleToDel.get();
			villeRepo.delete(villeToDel);
		} catch (NoSuchElementException e) {
			System.out.println("Ville inexistante !");
		}
	}
	
	@ApiOperation(value = "Récupère toutes les voitures")
	@GetMapping("/allVoiture")
	public List<Voiture> allVoiture(){
		return (List<Voiture>) voitureRepo.findAll();
	}
	
	@ApiOperation(value = "Ajoute une voiture dans la base de données")
	@PutMapping("/addVoiture")
	public void addVille(@RequestBody Voiture voiture) {
		voitureRepo.save(voiture);
		System.out.println(voiture.getName() + "ajoutée !");
	}
	
	@ApiOperation(value = "Modifie le nom d'une voiture dans la base de données")
	@PostMapping("/updateVoiture")
	public void updateVille(@RequestBody Voiture voiture) {
		Optional<Voiture> OptionalVilleToModif = voitureRepo.findById(voiture.getId());
		Voiture voitureToModif = OptionalVilleToModif.get();
		voitureToModif.setName(voiture.getName());
		voitureRepo.save(voitureToModif);
		System.out.println("Voiture update !");
	}
	
	@ApiOperation(value = "Supprime une voiture dans la base de données")
	@DeleteMapping("/deleteVoiture")
	public void deleteVille(@RequestBody Voiture voiture) {
		Optional<Voiture> OptionalVilleToDel = voitureRepo.findById(voiture.getId());
		try {
			Voiture voitureToDel = OptionalVilleToDel.get();
			voitureRepo.delete(voitureToDel);
		} catch (NoSuchElementException e) {
			System.out.println("Voiture inexistante !");
		}
	}
	
	@ApiOperation(value = "Récupère toutes les personnes")
	@GetMapping("/allPersonne")
	public List<Personne> allPersonne(){
		return (List<Personne>) personneRepo.findAll();
	}
	
	@ApiOperation(value = "Ajoute une personne dans la base de données")
	@PutMapping("/addPersonne")
	public void addPersonne(@RequestBody Personne personne) {
		personneRepo.save(personne);
		System.out.println(personne.getNom() + "ajoutée !");
	}
	
	@ApiOperation(value = "Modifie le nom d'une personne dans la base de données")
	@PostMapping("/updatePersonne")
	public void updatePersonne(@RequestBody Personne personne) {
		Optional<Personne> OptionalPersonneToModif = personneRepo.findById(personne.getIdPersonne());
		Personne personneToModif = OptionalPersonneToModif.get();
		personneToModif.setNom(personne.getNom());
		personneRepo.save(personneToModif);
		System.out.println("Personne update !");
	}
	
	@ApiOperation(value = "Supprime une personne dans la base de données")
	@DeleteMapping("/deletePersonne")
	public void deletePersonne(@RequestBody Personne personne) {
		Optional<Personne> OptionalPersonneToDel = personneRepo.findById(personne.getIdPersonne());
		try {
			Personne personneToDel = OptionalPersonneToDel.get();
			personneRepo.delete(personneToDel);
		} catch (NoSuchElementException e) {
			System.out.println("Personne inexistante !");
		}
	}
	
}
