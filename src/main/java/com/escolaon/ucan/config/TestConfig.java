package com.escolaon.ucan.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.escolaon.ucan.entities.Aluno;
import com.escolaon.ucan.entities.Biologica;
import com.escolaon.ucan.entities.Curso;
import com.escolaon.ucan.repositories.AlunoRepository;
import com.escolaon.ucan.repositories.BiologicaRepository;

/**
 * 
 * @author Jefferson Souza Rodrigues
 * Perfil de teste de configuração 
 * Dependencia com a classe do Repositories
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private BiologicaRepository biologicaRepository;
	

	@Override
	public void run(String... args) throws Exception {
		Aluno a1 = new Aluno(null, "Suellen", null);
		Aluno a2 = new Aluno(null, "Jefferson", null);
		Aluno a3 = new Aluno(null, "Cesinha", null);
		
		Biologica c1 = new Biologica();
		
		alunoRepository.saveAll(Arrays.asList(a1, a2, a3));
		biologicaRepository.saveAll(Arrays.asList(c1));

	}
	
	
	
}
