package com.escolaon.ucan.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.escolaon.ucan.entities.Aluno;
import com.escolaon.ucan.services.AlunoService;

@Controller
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		
		List<Aluno> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	 @RequestMapping(value = "/{id}",  method = RequestMethod.GET)
     public ResponseEntity<Aluno> listaCursos(@PathVariable Long id) {
           Aluno a1 = service.findById(id);
           return ResponseEntity.ok().body(a1); 
     }
	 
	 @RequestMapping(value = "/cadastroDeAluno", method = RequestMethod.GET)
	 public String cadastroAluno(){
		   return "cadastroDeAluno";
		}
	
	
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<Aluno> findById(@PathVariable Long id) {
//		Aluno obj = service.findById(id);
//		
//		return ResponseEntity.ok().body(obj);
//	}
	
	@PostMapping
	public ResponseEntity<Aluno> insert (@RequestBody Aluno obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
