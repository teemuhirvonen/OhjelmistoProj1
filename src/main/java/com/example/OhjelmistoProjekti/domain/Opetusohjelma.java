package com.example.OhjelmistoProjekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Opetusohjelma {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ohjelmaid;
	private String ohjelma;

	
	
	
	
	public Opetusohjelma() {
		
	}
	
	public Opetusohjelma(String ohjelma) {
		super();
		this.ohjelma=ohjelma;
	}

	public Long getOhjelmaid() {
		return ohjelmaid;
	}

	public void setOhjelmaid(Long ohjelmaid) {
		this.ohjelmaid = ohjelmaid;
	}

	public String getOhjelma() {
		return ohjelma;
	}

	public void setOhjelma(String ohjelma) {
		this.ohjelma = ohjelma;
	}
	
	
	

	@Override
	public String toString() {
		return ohjelma+ohjelmaid;
	}
}
