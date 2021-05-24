package com.escolaon.ucan.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double nota;
	

	
	/**
	 * Criando uma tabela de associação entre o aluno e Disciplina
	 * @table tb_curso_disciplina
	 */
	@ManyToMany
	@JoinTable(name = "tb_disciplina_aluno", 
	joinColumns = @JoinColumn(name = "disciplina_id"),
	inverseJoinColumns = @JoinColumn(name = "aluno_id"))
	private List<Aluno> alunos_disciplina = new ArrayList<>();
	
	/**
	 * Construtor vazio
	 */
	public Disciplina() {}

	
	public Disciplina(Long id, String nome, double nota) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}


	
	
	
}

