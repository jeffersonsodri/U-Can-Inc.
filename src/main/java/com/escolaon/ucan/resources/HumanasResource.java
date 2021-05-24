package com.escolaon.ucan.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolaon.ucan.entities.Humanas;
import com.escolaon.ucan.services.HumanasService;

@RestController
@RequestMapping(value = "/humanas")
public class HumanasResource {
	
	@Autowired
	private HumanasService service;
	
	
	@GetMapping
	public ResponseEntity<List<Humanas>> findAll(){
		
		List<Humanas> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Humanas> findById(@PathVariable Long id) {
		Humanas obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}	
	
	
}
