package com.example.OhjelmistoProjekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	private String answer;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="questionid")
	private Question question;
	
	public Answer(){}
	
	public Answer(String answer){
		this.answer = answer;
	}
	
	public Answer(String answer, Question question){
		super();
		this.answer = answer;
		this.question = question;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion(){
		return question;
	}
	
	public void setQuestion(Question question){
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", question="
				+ question + "]";
	}

}
