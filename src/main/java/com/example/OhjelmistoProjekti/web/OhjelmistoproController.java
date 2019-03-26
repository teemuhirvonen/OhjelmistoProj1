package com.example.OhjelmistoProjekti.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OhjelmistoproController {
	
	@RequestMapping(value="/lorem", method=RequestMethod.GET)
	public @ResponseBody List<Question> QuestionListRest() {
		return (List<Question>) repository.findAll();
	}

}
