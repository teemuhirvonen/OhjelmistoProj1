package com.example.OhjelmistoProjekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Kaipaus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long kaipausid;
	private String kaipaus;
	

	
	
	public Kaipaus() {}
	
	public Kaipaus(String kaipaus) {
		this.kaipaus=kaipaus;
	}

	public Long getKaipausid() {
		return kaipausid;
	}

	public void setKaipausid(Long kaipausid) {
		this.kaipausid = kaipausid;
	}

	public String getKaipaus() {
		return kaipaus;
	}

	public void setKaipaus(String kaipaus) {
		this.kaipaus = kaipaus;
	}
	
	
	

	@Override
	public String toString() {
		return kaipaus+kaipausid;
	}

}
