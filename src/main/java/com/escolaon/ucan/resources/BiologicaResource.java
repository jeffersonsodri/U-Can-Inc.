package com.escolaon.ucan.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolaon.ucan.entities.Biologica;
import com.escolaon.ucan.services.BiologicaService;

@RestController
@RequestMapping(value = "/biologicas")
public class BiologicaResource {
	
	@Autowired
	private BiologicaService service;
	
	
	@GetMapping
	public ResponseEntity<List<Biologica>> findAll(){
		
		List<Biologica> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Biologica> findById(@PathVariable Long id) {
		Biologica obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
}
