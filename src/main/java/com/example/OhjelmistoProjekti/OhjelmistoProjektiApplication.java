package com.example.OhjelmistoProjekti;

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

@SpringBootApplication
public class OhjelmistoProjektiApplication {
	private static final Logger log = LoggerFactory.getLogger(OhjelmistoProjektiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OhjelmistoProjektiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner questionDemo(QuestionRepository qrepository, AnswerRepository arepository) {
		return (args) -> {
			log.info("kokeilu");
			
			qrepository.save(new Question ("Sukupuoli?"));
			qrepository.save(new Question ("Monetta vuotta opiskelet Haaga-Heliassa?"));
			qrepository.save(new Question ("Mihin koulutusohjelman linjaan suuntaudut?"));
			qrepository.save(new Question ("Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?"));
			qrepository.save(new Question ("Onko Haaga-Heliassa mielestäsi tarpeeksi visuaaliseen suunnitteluun ohjaavia kursseja?"));
			qrepository.save(new Question ("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?"));
			qrepository.save(new Question ("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?"));
			qrepository.save(new Question ("Miten toivoisit työkaluja opetettavan?"));
			qrepository.save(new Question ("Oletko suorittanut UX/UI suunnittelu kursseja jonkin muun koulun/palvelun kautta?"));
			

			log.info("nouto");
			for (Answer answer : arepository.findAll()){
				log.info(answer.toString());
			}
		};
	}

}