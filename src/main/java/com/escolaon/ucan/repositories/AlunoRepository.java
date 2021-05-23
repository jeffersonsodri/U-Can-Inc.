package com.escolaon.ucan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escolaon.ucan.entities.Aluno;

public interface AlunoRepository  extends JpaRepository<Aluno, Long>{

	
}
