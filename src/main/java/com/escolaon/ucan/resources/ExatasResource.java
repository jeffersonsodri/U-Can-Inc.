package com.escolaon.ucan.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.escolaon.ucan.entities.Exatas;
import com.escolaon.ucan.services.ExatasService;

@Controller
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
	
	@PostMapping
	public ResponseEntity<Exatas> insert (@RequestBody Exatas obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
}
