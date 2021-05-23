package com.escolaon.ucan.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public abstract class Curso implements Serializable {
	
	/**
	 * Default Serializable
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double media;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "alunoId")
	private Aluno aluno;	
	
	/**
	 * Criando uma tabela de associação entre o curso e Disciplina
	 * @table tb_curso_disciplina
	 */
	@ManyToMany
	@JoinTable(name = "tb_curso_disciplina", 
	joinColumns = @JoinColumn(name = "curso_id"),
	inverseJoinColumns = @JoinColumn(name = "disicplina_id"))
	private Set<Disciplina> disciplinas = new HashSet<>();
	
	
	
	public Curso() {}


	public Curso(Long id, double media, String status, Aluno aluno, Set<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.media = media;
		this.status = status;
		this.aluno = aluno;
		this.disciplinas = disciplinas;
	}


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
