package com.escolaon.ucan.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Incremento para o bancod e dados
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy = "aluno")
	private List<Curso> listaCursos = new ArrayList<>();
	
	@OneToMany(mappedBy = "alunoDis")
	private List<Disciplina> listaDisciplina = new ArrayList<>();
	
	
	public Aluno(Long id, String nome, List<Curso> listaCursos) {
		super();
		this.id = id;
		this.nome = nome;
		this.listaCursos = listaCursos;
	} 
	
	public Aluno() {}
	 
	 
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
	
	/**
	 * Coleção somente o get
	 * @return
	 */
	public List<Curso> getListaCursos() {
		return listaCursos;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
} 
