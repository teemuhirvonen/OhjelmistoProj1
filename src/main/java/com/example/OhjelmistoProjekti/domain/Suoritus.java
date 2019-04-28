package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Suoritus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long suoritusid;
	private String suoritus;
	
	//@suhde
	
	public Suoritus(){
}
	
	public Suoritus(String suoritus) {
		this.suoritus=suoritus;
	}

	public Long getSuoritusid() {
		return suoritusid;
	}

	public void setSuoritusid(Long suoritusid) {
		this.suoritusid = suoritusid;
	}

	public String getSuoritus() {
		return suoritus;
	}

	public void setSuoritus(String suoritus) {
		this.suoritus = suoritus;
	}
	
	@Override
	public String toString() {
		return suoritus+suoritusid;
	}
	
}
