package com.escolaon.ucan.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolaon.ucan.entities.Exatas;
import com.escolaon.ucan.services.ExatasService;

@RestController
@RequestMapping(value = "/exatas")
public class ExatasResource {
	
	@Autowired
	private ExatasService service;
	
	
	@GetMapping
	public ResponseEntity<List<Exatas>> findAll(){
		
		List<Exatas> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Exatas> findById(@PathVariable Long id) {
		Exatas obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
}
