package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tyollistyminen {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long haluid;
	private String halu;
	
	
	//@suhde
	
	public Tyollistyminen() {}
	
	public Tyollistyminen(String halu) {
		this.halu=halu;
	}

	public Long getHaluid() {
		return haluid;
	}

	public void setHaluid(Long haluid) {
		this.haluid = haluid;
	}

	public String getHalu() {
		return halu;
	}

	public void setHalu(String halu) {
		this.halu = halu;
	}
	
	@Override
	public String toString() {
		return halu+haluid;
	}

}
