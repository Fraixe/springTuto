package com.afpa.springTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.afpa.springTest.beans.Ville;

@Repository
public interface VilleRepository extends CrudRepository<Ville, Integer>{


}
