package com.example.OhjelmistoProjekti.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.OhjelmistoProjekti.domain.Answer;
import com.example.OhjelmistoProjekti.domain.AnswerRepository;
import com.example.OhjelmistoProjekti.domain.Question;
import com.example.OhjelmistoProjekti.domain.QuestionRepository;



@CrossOrigin
@Controller
public class OhjelmistoproController {
	
	@Autowired
	private QuestionRepository repository;
	
	@Autowired
	private AnswerRepository arepository;
	
	//RESTful service show all questions
	@RequestMapping(value="/questions", method=RequestMethod.GET)
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) repository.findAll();
	}
	
	//RESTful service show all answers
	@RequestMapping(value="/questions/answers", method=RequestMethod.GET)
	public @ResponseBody List<Answer> answerListRest() {
		return (List<Answer>) arepository.findAll();
	}
	
	@RequestMapping(value="questions/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Question> findQuestionREST(@PathVariable("id") Long questionid){
		return repository.findById(questionid);
	} 
	
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
	
	// Add new question 
    @RequestMapping(value = "/add", method=RequestMethod.GET)
    public String lisaaKysymys(Model model){
    	model.addAttribute("question", new Question());
    	return "redirect:../";
    }   

	 
}
