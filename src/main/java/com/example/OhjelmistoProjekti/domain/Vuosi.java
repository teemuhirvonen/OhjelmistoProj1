package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vuosi {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vuosiid;
	private String lkm;
	
	
	//@suhde
	
	
	
	public Vuosi() {}
	
	public Vuosi(String lkm) {
		this.lkm=lkm;
	}

	public Long getVuosiid() {
		return vuosiid;
	}

	public void setVuosiid(Long vuosiid) {
		this.vuosiid = vuosiid;
	}

	public String getLkm() {
		return lkm;
	}

	public void setLkm(String lkm) {
		this.lkm = lkm;
	}
	
	@Override
	public String toString() {
		return lkm+vuosiid;
	}
	
}
