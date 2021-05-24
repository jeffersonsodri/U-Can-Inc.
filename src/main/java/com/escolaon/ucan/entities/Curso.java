package com.escolaon.ucan.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	/**
	 * Criando uma tabela de associação entre o curso e Disciplina
	 * @table tb_curso_disciplina
	 */
		
	
	public Curso() {}


	public Curso(Long id, double media, String status, Aluno aluno, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.media = media;
		this.status = status;
		this.aluno = aluno;
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