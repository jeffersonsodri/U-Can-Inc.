package com.escolaon.ucan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
	
	
	public Curso() {
	}


	public Curso(double media, String status) {
		this.media = media;
		this.status = status;
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
	
	
	
	
}
