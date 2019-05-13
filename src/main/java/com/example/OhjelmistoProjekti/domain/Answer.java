package com.example.OhjelmistoProjekti.domain;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long answerid;
	
	@Column(name="answer")
	private String answer;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "answers")    
    private Set<Question> questions;  

	public Answer(){}
	
	public Answer(String answer){
		super();
		this.answer = answer;
	}
	
	public Long getAnswerid() {
		return answerid;
	}

	public void setAnswerid(Long answerid) {
		this.answerid = answerid;
	}
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", answer=" + answer + "]";
	}
	
}