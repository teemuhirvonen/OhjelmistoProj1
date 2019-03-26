package com.example.OhjelmistoProjekti.domain;


import javax.persistence.Entity;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long Id;
}
