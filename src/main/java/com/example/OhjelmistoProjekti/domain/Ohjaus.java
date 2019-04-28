package com.example.OhjelmistoProjekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ohjaus {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long ohjausid;
private String ohjaus;



public Ohjaus() {}

public Ohjaus(String ohjaus) {
	this.ohjaus=ohjaus;
}

public Long getOhjausid() {
	return ohjausid;
}

public void setOhjausid(Long ohjausid) {
	this.ohjausid = ohjausid;
}

public String getOhjaus() {
	return ohjaus;
}

public void setOhjaus(String ohjaus) {
	this.ohjaus = ohjaus;
}



@Override
public String toString() {
	return ohjaus+ohjausid;
}
	
}
