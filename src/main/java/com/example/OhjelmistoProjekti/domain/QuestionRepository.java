package com.example.OhjelmistoProjekti.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	
	List<Question> findByQuestion (String question);
}
