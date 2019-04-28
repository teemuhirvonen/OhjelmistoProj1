package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Toivomus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long toivomusid;
	private String toivomus;
	
	
	
	//@suhde
	
	
	
	public Toivomus() {}
	
	public Toivomus(String toivomus) {
		this.toivomus=toivomus;
	}

	public Long getToivomusid() {
		return toivomusid;
	}

	public void setToivomusid(Long toivomusid) {
		this.toivomusid = toivomusid;
	}

	public String getToivomus() {
		return toivomus;
	}

	public void setToivomus(String toivomus) {
		this.toivomus = toivomus;
	}
	
	@Override
	public String toString() {
		return toivomus+toivomusid;
	}

}
