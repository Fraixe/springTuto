package com.afpa.springTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.afpa.springTest.beans.Ville;

/**
 * @author Lucas
 *Interface utilisé pour implémenter les méthodes CRUD pour les villes
 */
@Repository
public interface VilleRepository extends CrudRepository<Ville, Integer>{


}
