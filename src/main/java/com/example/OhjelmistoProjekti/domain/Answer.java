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
	public Long answerid;
	private String answer;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="questionid")
	private Question questionid;
	
	public Answer(){}
	
	public Answer(String answer){
		this.answer = answer;
	}
	
	public Answer(String answer, Question questionid){
		super();
		this.answer = answer;
		this.questionid = questionid;
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

	public Question getQuestionid() {
		return questionid;
	}

	public void setQuestionid(Question questionid) {
		this.questionid = questionid;
	}

	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", answer=" + answer
				+ ", question=" + questionid + "]";
	}
	
	

}