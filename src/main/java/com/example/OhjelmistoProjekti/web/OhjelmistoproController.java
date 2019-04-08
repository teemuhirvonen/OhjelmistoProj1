package com.example.OhjelmistoProjekti.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.OhjelmistoProjekti.domain.Question;
import com.example.OhjelmistoProjekti.domain.QuestionRepository;



@Controller
public class OhjelmistoproController {
	
	@Autowired
	private QuestionRepository repository;
	
	//RESTful service show all questions
	@RequestMapping(value="/questions", method=RequestMethod.GET)
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) repository.findAll();
	}
	
	//RESTful service show question by id
	 @RequestMapping(value="/questions/{id}", method = RequestMethod.GET)
	    public @ResponseBody Optional<Question> findQuestionRest(@PathVariable("id") Long questionId) {	
	    	return repository.findById(questionId);
	 }
	 
	// Save question POST
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(Question question){
	        repository.save(question);
	        return "redirect:questions";
	    } 
	 
}
