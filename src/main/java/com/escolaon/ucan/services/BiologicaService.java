package com.escolaon.ucan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolaon.ucan.entities.Biologica;
import com.escolaon.ucan.repositories.BiologicaRepository;

@Service
public class BiologicaService {

	/**
	 * Dependencia injetada automaticamente com @Autowired
	 */
	@Autowired
	private BiologicaRepository repository;

	public List<Biologica> findAll() {
		return repository.findAll();
	}

	public Biologica findById(Long id) {
		Optional<Biologica> obj = repository.findById(id);

		return obj.get();
	}

	public Biologica insert(Biologica obj) {
		return repository.save(obj);
	}

}
