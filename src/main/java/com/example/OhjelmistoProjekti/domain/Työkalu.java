package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Työkalu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long tyokaluid;
	private String työkalu;
	
	
	//@suhde
	
	
	
	public Työkalu() {}
	
	
	public Työkalu(String työkalu) {
		this.työkalu=työkalu;
	}


	public Long getTyokaluid() {
		return tyokaluid;
	}


	public void setTyokaluid(Long tyokaluid) {
		this.tyokaluid = tyokaluid;
	}


	public String getTyökalu() {
		return työkalu;
	}


	public void setTyökalu(String työkalu) {
		this.työkalu = työkalu;
	}
	
	@Override
	public String toString() {
		return työkalu+tyokaluid;
	}

}
