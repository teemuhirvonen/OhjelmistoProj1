package com.example.OhjelmistoProjekti.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.OhjelmistoProjekti.domain.Question;
import com.example.OhjelmistoProjekti.domain.QuestionRepository;


@CrossOrigin
@Controller
public class OhjelmistoproController {
	
	@Autowired
	private QuestionRepository repository;
	
	//RESTful service show all questions
	@RequestMapping(value="/questions", method=RequestMethod.GET)
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) repository.findAll();
	}
<<<<<<< HEAD
	
	//RESTful service show question by id
	 @RequestMapping(value="/questions/{id}", method = RequestMethod.GET)
	    public @ResponseBody Optional<Question> findQuestionRest(@PathVariable("id") Long questionId) {	
	    	return repository.findById(questionId);
	 }
=======
>>>>>>> c6768655b6078fe360776a19d631da86b80c9807
	 
	// Save question POST
	@RequestMapping(value = "/questions", method=RequestMethod.POST)
	public @ResponseBody List<Question> addNewAnswer(@RequestBody Question question){
		return (List<Question>) repository.save(question);
	}
	
	    
	// Delete Question
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String poistakysymys(@PathVariable("id") Long questionId, Model model) {
		repository.deleteById(questionId);
		return "redirect:../";	
	}
	    

	 
}
