package com.afpa.springTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.afpa.springTest.beans.Personne;


/**
 * @author Lucas
 *Interface utilisé pour implémenter les méthodes CRUD pour les Personne
 */
@Repository
public interface PersonneRepository extends CrudRepository<Personne, Integer>{

}
