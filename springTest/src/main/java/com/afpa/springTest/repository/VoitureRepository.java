package com.afpa.springTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.afpa.springTest.beans.Voiture;

/**
 * @author Lucas
 *Interface utilisé pour implémenter les méthodes CRUD pour les Voitures
 */

@Repository
public interface VoitureRepository extends CrudRepository<Voiture, Integer>{

}
