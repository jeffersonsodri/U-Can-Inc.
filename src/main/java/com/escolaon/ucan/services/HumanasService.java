package com.escolaon.ucan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolaon.ucan.entities.Humanas;
import com.escolaon.ucan.repositories.HumanasRepository;

@Service
public class HumanasService {
	
	/**
	 * Dependencia injetada automaticamente com @Autowired
	 */
	@Autowired
	private HumanasRepository repository; 
	
	public List<Humanas> findAll() {
		return repository.findAll();
	}
	
	public Humanas findById(Long id) {
		Optional<Humanas> obj = repository.findById(id);
		
		return obj.get();
	}
	
}
