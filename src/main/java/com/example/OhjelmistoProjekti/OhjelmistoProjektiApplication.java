package com.example.OhjelmistoProjekti;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.OhjelmistoProjekti.domain.Question;
import com.example.OhjelmistoProjekti.domain.QuestionRepository;
import com.example.OhjelmistoProjekti.domain.Answer;
import com.example.OhjelmistoProjekti.domain.AnswerRepository;
import com.example.OhjelmistoProjekti.domain.Type;
import com.example.OhjelmistoProjekti.domain.TypeRepository;
import com.example.OhjelmistoProjekti.domain.UserRepository;
import com.example.OhjelmistoProjekti.domain.User;


@SpringBootApplication
public class OhjelmistoProjektiApplication {
	private static final Logger log = LoggerFactory.getLogger(OhjelmistoProjektiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OhjelmistoProjektiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner questionDemo(QuestionRepository repository, AnswerRepository arepository, TypeRepository trepository, UserRepository urepository) {
		return (args) -> {
			log.info("kokeilu");
			
			trepository.save(new Type("radio"));
			trepository.save(new Type("checkbox"));
			trepository.save(new Type("text"));
		
			Question question1 = new Question("Sukupuoli?", "radio", trepository.findByType("radio").get(0));
			Question question2 = new Question("Monetta vuotta opiskelet Haaga-Heliassa?", "radio",trepository.findByType("radio").get(0));
			Question question3 = new Question ("Mihin koulutusohjelman linjaan suuntaudut?", "radio", trepository.findByType("radio").get(0));
			Question question4 = new Question ("Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?", "radio", trepository.findByType("radio").get(0));
			Question question5 = new Question ("Onko Haaga-Heliassa mielestäsi tarpeeksi visuaaliseen suunnitteluun ohjaavia kursseja?", "radio",trepository.findByType("radio").get(0));
			Question question6 = new Question ("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?", "checkbox", trepository.findByType("checkbox").get(0));
			Question question7 = new Question ("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?", "checkbox", trepository.findByType("checkbox").get(0));
			Question question8 = new Question ("Miten toivoisit työkaluja opetettavan?", "checkbox", trepository.findByType("checkbox").get(0));
			Question question9 = new Question ("Oletko suorittanut UX/UI suunnittelu kursseja jonkin muun koulun/palvelun kautta?", "radio", trepository.findByType("radio").get(0));
			
			Answer answer1 = new Answer("Mies", 0);
			Answer answer2 = new Answer("Nainen", 0);
			Answer answer3 = new Answer("Muu", 0);
			
			Answer answer4 = new Answer("1", 0);
			Answer answer5 = new Answer("2", 0);
			Answer answer6 = new Answer("3", 0);
			Answer answer7 = new Answer("4+", 0);
			
			Answer answer8 = new Answer("Ohjelmistotuotanto", 0);
			Answer answer9 = new Answer("Digipalvelut", 0);
			Answer answer10 = new Answer("Infrastruktuuri", 0);
			Answer answer11= new Answer("Liiketoiminta", 0);
			
			Answer answer12 = new Answer("En", 0);
			Answer answer13 = new Answer("En, mutta olen kiinnostunut oppimaan aiheesta", 0);
			Answer answer14 = new Answer("Kyllä", 0);
			Answer answer15 = new Answer("Ehkä", 0);
			
			Answer answer16 = new Answer("Kyllä", 0);
			Answer answer17 = new Answer("Ehkä", 0);
			Answer answer18 = new Answer("Ei", 0);
			
			Answer answer19 = new Answer("Marvel App", 0);
			Answer answer20 = new Answer("inVision", 0);
			Answer answer21 = new Answer("Photoshop", 0);
			Answer answer22 = new Answer("Illustrator", 0);
			Answer answer23 = new Answer("InDesign", 0);
			Answer answer24 = new Answer("Adobe XD", 0);
			Answer answer25 = new Answer("En ole käyttänyt", 0);
			Answer answer26 = new Answer("Jotain muita", 0);
			Answer answer27 = new Answer("En osaa sanoa/En kaipaa opetusta näistä", 0);
			
			Answer answer28 = new Answer("Kurssi aiheesta", 0);
			Answer answer29 = new Answer("Jonkin muun kurssin sisällä", 0);
			Answer answer30 = new Answer("Intensiivikurssi", 0);
			
			Answer answer31 = new Answer("Kyllä", 0);
			Answer answer32 = new Answer("En", 0);
		
			arepository.save(answer1);
			arepository.save(answer2);
			arepository.save(answer3);
			arepository.save(answer4);
			arepository.save(answer5);
			arepository.save(answer6);
			arepository.save(answer7);
			arepository.save(answer8);
			arepository.save(answer9);
			arepository.save(answer10);
			arepository.save(answer11);
			arepository.save(answer12);
			arepository.save(answer13);
			arepository.save(answer14);
			arepository.save(answer15);
			arepository.save(answer16);
			arepository.save(answer17);
			arepository.save(answer18);
			arepository.save(answer19);
			arepository.save(answer20);
			arepository.save(answer21);
			arepository.save(answer22);
			arepository.save(answer23);
			arepository.save(answer24);
			arepository.save(answer25);
			arepository.save(answer26);
			arepository.save(answer27);
			arepository.save(answer28);
			arepository.save(answer29);
			arepository.save(answer30);
			arepository.save(answer31);
			arepository.save(answer32);
			
			Set<Answer> answers1 = new HashSet<Answer>();
			answers1.add(answer1);
			answers1.add(answer2);
			answers1.add(answer3);
			
			question1.setAnswers(answers1);
			repository.save(question1);
			
			Set<Answer> answers2 = new HashSet<Answer>();
			answers2.add(answer4);
			answers2.add(answer5);
			answers2.add(answer6);
			answers2.add(answer7);
			
			question2.setAnswers(answers2);
			repository.save(question2);
			
			Set<Answer> answers3 = new HashSet<Answer>();
			answers3.add(answer8);
			answers3.add(answer9);
			answers3.add(answer10);
			answers3.add(answer11);
			
			question3.setAnswers(answers3);
			repository.save(question3);
			
			Set<Answer> answers4 = new HashSet<Answer>();
			answers4.add(answer12);
			answers4.add(answer13);
			answers4.add(answer14);
			answers4.add(answer15);
			
			question4.setAnswers(answers4);
			repository.save(question4);
			
			Set<Answer> answers5 = new HashSet<Answer>();
			answers5.add(answer16);
			answers5.add(answer17);
			answers5.add(answer18);
			
			question5.setAnswers(answers5);
			repository.save(question5);
			
			Set<Answer> answers6 = new HashSet<Answer>();
			answers6.add(answer19);
			answers6.add(answer20);
			answers6.add(answer21);
			answers6.add(answer22);
			answers6.add(answer23);
			answers6.add(answer24);
			answers6.add(answer25);
			answers6.add(answer26);
			answers6.add(answer27);
			
			question6.setAnswers(answers6);
			repository.save(question6);
			
			Set<Answer> answers7 = new HashSet<Answer>();
			answers7.add(answer19);
			answers7.add(answer20);
			answers7.add(answer21);
			answers7.add(answer22);
			answers7.add(answer23);
			answers7.add(answer24);
			answers7.add(answer25);
			answers7.add(answer26);
			answers7.add(answer27);
			
			question7.setAnswers(answers7);
			repository.save(question7);
			
			Set<Answer> answers8 = new HashSet<Answer>();
			answers8.add(answer28);
			answers8.add(answer29);
			answers8.add(answer30);
			
			question8.setAnswers(answers8);
			repository.save(question8);
			
			Set<Answer> answers9 = new HashSet<Answer>();
			answers9.add(answer31);
			answers9.add(answer32);
			
			question9.setAnswers(answers9);
			repository.save(question9);
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);

			log.info("nouto");
			for (Question question : repository.findAll()){
				log.info(question.toString());
			}
		};
	}

}