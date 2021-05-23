package com.escolaon.ucan.entities;

import java.io.Serializable;

public abstract class Curso implements Serializable {
	
	/**
	 * Default Serializable
	 */
	private static final long serialVersionUID = 1L;
	
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
