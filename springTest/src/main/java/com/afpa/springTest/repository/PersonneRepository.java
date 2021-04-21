package com.afpa.springTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.afpa.springTest.beans.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Integer>{

}
