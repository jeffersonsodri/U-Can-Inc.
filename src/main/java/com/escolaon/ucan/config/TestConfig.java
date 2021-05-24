package com.escolaon.ucan.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.escolaon.ucan.entities.Aluno;
import com.escolaon.ucan.entities.Biologica;
import com.escolaon.ucan.entities.Disciplina;
import com.escolaon.ucan.entities.Exatas;
import com.escolaon.ucan.entities.Humanas;
import com.escolaon.ucan.repositories.AlunoRepository;
import com.escolaon.ucan.repositories.BiologicaRepository;
import com.escolaon.ucan.repositories.DisciplinaRepository;
import com.escolaon.ucan.repositories.ExatasRepository;
import com.escolaon.ucan.repositories.HumanasRepository;

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
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	@Autowired
	private ExatasRepository exatasRepository;
	@Autowired
	private HumanasRepository humanasRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		
		Aluno a1 = new Aluno(null, "Suellen", null);
		Aluno a2 = new Aluno(null, "Jefferson", null);
		Aluno a3 = new Aluno(null, "Cesinha", null);

		
		Disciplina d1 = new Disciplina(null, "Aerobiologia", 10);
		Disciplina d2 = new Disciplina(null, "Anatomia", 10);
		Disciplina d3 = new Disciplina(null, "Antropologia", 10);
		Disciplina d4 = new Disciplina(null, "Cálculo", 5);
		Disciplina d5 = new Disciplina(null, "Geometria", 3);
		Disciplina d6 = new Disciplina(null, "Trigonometria", 8);
		Disciplina d7 = new Disciplina(null, "Direito Civil", 8);
		Disciplina d8 = new Disciplina(null, "Psicologia", 8);
		Disciplina d9 = new Disciplina(null, "Filosofia", 8);
		
		
		disciplinaRepository.saveAll(Arrays.asList(d1, d2, d3, d4, d5, d6, d7, d8, d9));
		alunoRepository.saveAll(Arrays.asList(a1, a2, a3));
		
		a1.getDisciplinas().add(d1);
		a1.getDisciplinas().add(d2);
		a1.getDisciplinas().add(d3);
		a1.getDisciplinas().add(d4);
		a1.getDisciplinas().add(d5);
		a1.getDisciplinas().add(d6);
		a2.getDisciplinas().add(d1);
		a2.getDisciplinas().add(d2);
		a2.getDisciplinas().add(d3);
		
		
		alunoRepository.saveAll(Arrays.asList(a1, a2));

		Biologica c1 = new Biologica(0L, a1, 7.3 , "APROVADO", Arrays.asList(d1,d2,d3));
		Biologica c2 = new Biologica(0L, a2, 5, "REPROVADO", Arrays.asList(d1,d2,d3));
		Biologica c3 = new Biologica(0L, a3, 8, "APROVADO", Arrays.asList(d1,d2,d3));
		
		Exatas e1 = new Exatas(0L, a1, 8, "APROVADO", Arrays.asList(d4,d5,d6));
		
		Humanas h1 = new Humanas(0L, a3, 6, "REPROVADO", Arrays.asList(d7,d8,d9));
		
		
		
		biologicaRepository.saveAll(Arrays.asList(c1, c2, c3));
		exatasRepository.saveAll(Arrays.asList(e1));
		humanasRepository.saveAll(Arrays.asList(h1));
	}
	
	
	
}
