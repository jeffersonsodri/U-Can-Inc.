package com.escolaon.ucan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolaon.ucan.entities.Aluno;
import com.escolaon.ucan.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	/**
	 * Dependencia injetada automaticamente com @Autowired
	 */
	@Autowired
	private AlunoRepository repository; 
	
	public List<Aluno> findAll() {
		return repository.findAll();
	}
	
	public Aluno findById(Long id) {
		Optional<Aluno> obj = repository.findById(id);
		
		return obj.get();
	}
	
	public Aluno insert(Aluno obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public String cadastroAluno(){
		   return "cadastroDeAluno";
		}
	
	
}
