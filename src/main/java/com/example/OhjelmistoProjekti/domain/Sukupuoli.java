package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sukupuoli {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sukupuoliid;
	private String sukupuoli;
	
	
	//@suhde
	
	
	public Sukupuoli() {}
	
	public Sukupuoli(String sukupuoli) {
		this.sukupuoli=sukupuoli;
	}

	public Long getSukupuoliid() {
		return sukupuoliid;
	}

	public void setSukupuoliid(Long sukupuoliid) {
		this.sukupuoliid = sukupuoliid;
	}

	public String getSukupuoli() {
		return sukupuoli;
	}

	public void setSukupuoli(String sukupuoli) {
		this.sukupuoli = sukupuoli;
	}
	
	
	@Override
	public String toString() {
		return sukupuoli;
	}

}
