package com.escolaon.ucan.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public  class Biologica extends Curso implements Serializable	{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	public Biologica() {}
	
	
	
	public Biologica(Long id, Aluno aluno, double media, String status, List<Disciplina> disciplinas) {
		super(null, media, status, aluno, disciplinas);
		this.id = id;
	}

	public Long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Biologica other = (Biologica) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
