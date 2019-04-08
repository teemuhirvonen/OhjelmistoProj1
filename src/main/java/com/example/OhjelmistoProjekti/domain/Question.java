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
	private Answer answer;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "answer")
	private List<Answer> answers;

	public Question() {}
=======

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Question> questions;

	public String answer;
	
	public Question() {
		
	}
>>>>>>> c6768655b6078fe360776a19d631da86b80c9807
	
	public Question(String question, Answer answer) {
		this.question = question;
		this.answer = answer;
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
	
	public List<Answer> getAnswers(){
		return answers;
	}
	
	public void setAnswers(List<Answer> answers){
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + "]";
	}
}
	
