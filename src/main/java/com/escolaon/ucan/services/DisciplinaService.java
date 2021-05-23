package com.escolaon.ucan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolaon.ucan.entities.Disciplina;
import com.escolaon.ucan.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	/**
	 * Dependencia injetada automaticamente com @Autowired
	 */
	@Autowired
	private DisciplinaRepository repository; 
	
	public List<Disciplina> findAll() {
		return repository.findAll();
	}
	
	public Disciplina findById(Long id) {
		Optional<Disciplina> obj = repository.findById(id);
		
		return obj.get();
	}
	
}
