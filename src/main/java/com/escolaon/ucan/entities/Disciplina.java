package com.escolaon.ucan.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno alunoDis;
	
	/**
	 * Uma disciplina pode ser dada em vários cursos
	 */
	@ManyToMany(mappedBy = "disciplinas")
	private Set<Curso> cursos = new HashSet<>();
	
	/**
	 * Construtor vazio
	 */
	public Disciplina() {}

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

	public Aluno getAlunoDis() {
		return alunoDis;
	}

	public void setAlunoDis(Aluno alunoDis) {
		this.alunoDis = alunoDis;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}
	
	
	
	
}

