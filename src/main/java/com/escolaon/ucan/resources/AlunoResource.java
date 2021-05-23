package com.escolaon.ucan.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolaon.ucan.entities.Aluno;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@GetMapping
	public ResponseEntity<Aluno> findAll(){
		
		Aluno u = new Aluno(1L,"Suellen Rosemberg" , null);
		
		return ResponseEntity.ok().body(u);
	}
	
	
}
