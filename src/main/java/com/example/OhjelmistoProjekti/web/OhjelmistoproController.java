package com.example.OhjelmistoProjekti.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.OhjelmistoProjekti.domain.Question;
import com.example.OhjelmistoProjekti.domain.QuestionRepository;

@Controller
public class OhjelmistoproController {
	
	@Autowired
	private QuestionRepository repository;
	
	@RequestMapping(value="/lorem", method=RequestMethod.GET)
	public @ResponseBody List<Question> QuestionListRest() {
		return (List<Question>) repository.findAll();
	}

}
