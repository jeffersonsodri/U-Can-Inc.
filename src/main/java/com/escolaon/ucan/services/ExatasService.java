package com.escolaon.ucan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolaon.ucan.entities.Exatas;
import com.escolaon.ucan.repositories.ExatasRepository;

@Service
public class ExatasService {
	
	/**
	 * Dependencia injetada automaticamente com @Autowired
	 */
	@Autowired
	private ExatasRepository repository; 
	
	public List<Exatas> findAll() {
		return repository.findAll();
	}
	
	public Exatas findById(Long id) {
		Optional<Exatas> obj = repository.findById(id);
		
		return obj.get();
	}
	
	public Exatas insert(Exatas obj) {
		return repository.save(obj);
	}
	
}
