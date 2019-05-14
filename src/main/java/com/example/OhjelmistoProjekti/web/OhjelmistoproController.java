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
import com.example.OhjelmistoProjekti.domain.Type;
import com.example.OhjelmistoProjekti.domain.TypeRepository;
import com.example.OhjelmistoProjekti.domain.User;
import com.example.OhjelmistoProjekti.domain.UserRepository;




@CrossOrigin
@Controller
public class OhjelmistoproController {
	
	@Autowired
	private QuestionRepository repository;
	
	@Autowired
	private AnswerRepository arepository;
	
	@Autowired 
	private TypeRepository trepository;
	
	@Autowired
	private UserRepository urepository;
	
	//------------------------------ Questions---------------------------------
	
	//RESTful service to get all questions
	@RequestMapping(value="/questions", method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) repository.findAll();
	}
	
	//RESTful service to get question by id
    @RequestMapping(value="/questions/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Question> findQuestionREST(@PathVariable("id") Long questionid){
    	return repository.findById(questionid);
    }
    
    //RESTful service to add new question to database
  	@RequestMapping(value = "/questions", method=RequestMethod.POST)
  	@CrossOrigin
  	public @ResponseBody List<Question> addNewQuestion(@RequestBody Question question){
  		return (List<Question>) repository.save(question);
  	}
 	
 	//------------------------------ Answers---------------------------------
	
	//RESTful service get all answers 1/2
	@RequestMapping(value="/answers", method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody List<Answer> answerListRest() {
		return (List<Answer>) arepository.findAll();
	}
	
	//RESTful service get all answers 2/2
	@RequestMapping(value="/questions/answers", method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody List<Answer> questionanswerListRest() {
		return (List<Answer>) arepository.findAll();
	}
	
	//RESTful service to add new answer to database
	@RequestMapping(value = "/answers", method=RequestMethod.POST)
	@CrossOrigin
	public @ResponseBody String addNewAnswer(@RequestBody Answer answer){
		answer.answerCounter = + 1;
		arepository.save(answer);
		return "redirect:./answers";
	}
 
    //------------------------------ Types---------------------------------
 
   //RESTful service to get all types
    @RequestMapping(value= "/types", method=RequestMethod.GET)
    @CrossOrigin
    public @ResponseBody List<Type> typeREST(){
    	return (List<Type>) trepository.findAll();
    }
    
   //RESTful service to get type by id
    @RequestMapping(value="/types/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Type> findTypeREST(@PathVariable("id") Long typeid){
    	return trepository.findById(typeid);
    }
    
   //RESTful service to add new type to database
    @RequestMapping(value="/types", method = RequestMethod.POST)
    public @ResponseBody Type addNewTypeREST(@RequestBody Type type){
    	return trepository.save(type);
    }
    
    //------------------------------ Users---------------------------------
    
    //RESTful service to get all users
     @RequestMapping(value= "/users", method=RequestMethod.GET)
     @CrossOrigin
     public @ResponseBody List<User> userREST(){
     	return (List<User>) urepository.findAll();
     }
     
    //RESTful service to get user by id
     @RequestMapping(value="/users/{id}", method = RequestMethod.GET)
     public @ResponseBody Optional<User> findUserREST(@PathVariable("id") Long id){
     	return urepository.findById(id);
     }
     
    //RESTful service to add new user to database
     @RequestMapping(value="/users", method = RequestMethod.POST)
     public @ResponseBody User addNewUserREST(@RequestBody User user){
     	return urepository.save(user);
     }
 
  //------------------------------ Other---------------------------------
    
	// Add new question 
    @RequestMapping(value = "/add", method=RequestMethod.GET)
    @CrossOrigin
    public String lisaaKysymys(Model model){
    	model.addAttribute("question", new Question());
    	return "redirect:../";
    }
    
    // Add new questionAnswer
    @RequestMapping(value="addQuestionAnswer/{id}", method=RequestMethod.GET)
    public String QuestionaddAnswer(@PathVariable("id") Long questionid, Model model){
    	model.addAttribute("answers", arepository.findAll());
    	model.addAttribute("questions", repository.findAll());
    	return "redirect:../posttest";    	
    }
    
    @RequestMapping("/posttest")
    public String index(Model model){
    	List<Question> questions = (List<Question>) repository.findAll();
    	model.addAttribute("questions", questions);
    	return "posttest";
    }
    
    @RequestMapping("/questionlist")
    public String list(Model model){
    	List<Question> questions = (List<Question>) repository.findAll();
    	model.addAttribute("questions", questions);
    	return "questionlist";
    }
    
	@RequestMapping(value="/edit/{id}")
	public String editQuestion(@PathVariable("id") Long questionid, Model model){
		model.addAttribute("question", repository.findById(questionid));
		model.addAttribute("types", trepository.findAll());
		return "editquestion";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Question question){
	    repository.save(question);
	    return "redirect:questionlist";
	} 
	
	 // Delete Question
 	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
 	@CrossOrigin
 	public String poistakysymys(@PathVariable("id") Long questionId) {
 		repository.deleteById(questionId);
 		return "redirect:../questionlist";	
	
    @RequestMapping(value="/login")
	public String login(){
		return "login";
	}
}
