package com.afpa.springTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.afpa.springTest.beans.Voiture;

@Repository
public interface VoitureRepository extends CrudRepository<Voiture, Integer>{

}
