package com.example.OhjelmistoProjekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	private String question;
<<<<<<< HEAD
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Question> questions;
=======
	public String answer;
>>>>>>> 892e8803ebc5d64aee6bfddc19a7b70a86abab8e
	
	public Question() {
		
	}
	
	public Question(String question) {
		this.question = question;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public List<Question> getQuestions(){
		return questions;
	}
	
	public void setQuestions(List<Question> questions){
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + "]";
	}
}
	
