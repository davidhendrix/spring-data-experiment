package com.experiment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.experiment.entities.Dog;
import com.experiment.entities.DogRepository;

@RestController
public class DogController {

	@Autowired
	private DogRepository dogRepository;

	@PostMapping("/dog")
	public Dog createDog(@RequestBody Dog dog) {
		return dogRepository.save(dog);
	}
}
