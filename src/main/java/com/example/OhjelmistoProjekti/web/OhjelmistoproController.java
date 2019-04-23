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
	@CrossOrigin
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) repository.findAll();
	}
	
	//RESTful service show all answers
	@RequestMapping(value="/questions/answers", method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody List<Answer> answerListRest() {
		return (List<Answer>) arepository.findAll();
	}
	
	@RequestMapping(value="questions/{id}", method = RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody Optional<Question> findQuestionREST(@PathVariable("id") Long questionid){
		return repository.findById(questionid);
	} 
	
	// Save question POST
	@RequestMapping(value = "/questions", method=RequestMethod.POST)
	@CrossOrigin
	public @ResponseBody List<Question> addNewQuestion(@RequestBody Question question){
		return (List<Question>) repository.save(question);
	}
	
	// Save answer POST
	@RequestMapping(value = "/answers", method=RequestMethod.POST)
	@CrossOrigin
	public @ResponseBody List<Answer> addNewAnswer(@RequestBody Answer answer){
		return (List<Answer>) repository.save(answer);
	}
	   
	// Delete Question
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	@CrossOrigin
	public String poistakysymys(@PathVariable("id") Long questionId, Model model) {
		repository.deleteById(questionId);
		return "redirect:../";	
	}
	
	// Add new question 
    @RequestMapping(value = "/add", method=RequestMethod.GET)
    @CrossOrigin
    public String lisaaKysymys(Model model){
    	model.addAttribute("question", new Question());
    	return "redirect:../";
    }
    
    //Post test
    @RequestMapping(value="/posttest", method=RequestMethod.GET)
    @CrossOrigin
	public String PostTest(Model model) {
		model.addAttribute("answer", arepository.findAll());
		model.addAttribute("question", repository.findAll());
		return "posttest";
    }

	 
}
