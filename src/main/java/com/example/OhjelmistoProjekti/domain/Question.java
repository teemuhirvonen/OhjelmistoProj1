package com.example.OhjelmistoProjekti.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question {
	public long questionid;
	private String question, questionType;
	
	@Access(AccessType.FIELD)
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="typeid")
	private Type type;
	
	private Set<Answer> answers = new HashSet<Answer>(0);
	
	public Question() {}
	
	public Question(String question, String questionType, Type type) {
		this.question = question;
		this.setQuestionType(questionType);
		this.type = type;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getQuestionid() {
		return questionid;
	}
	
	public void setQuestionid(long questionid) {
		this.questionid = questionid;
	}
	
	@Column(name="question")
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "question_answer", joinColumns = { @JoinColumn(name = "questionid") }, inverseJoinColumns = { @JoinColumn(name = "answerid") })
	public Set<Answer> getAnswers() {
		return this.answers;
	}
	
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public boolean hasAnswer(Answer answer) {
		for (Answer questionAnswer: getAnswers()) {
			if (questionAnswer.getAnswerid() == answer.getAnswerid()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		if (this.type != null)
			return "id = " + questionid + "Category =" + this.getType();		
		else
			return "]";
	}
}
	
