package com.experiment.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DogRepository extends CrudRepository<Dog, String>{

	Dog findAllDogsByNameStartingWith(String start);
}
