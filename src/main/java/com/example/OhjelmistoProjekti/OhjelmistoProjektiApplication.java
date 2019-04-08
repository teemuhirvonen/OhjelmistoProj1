package com.example.OhjelmistoProjekti;

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

	public static void main(String[] args) {
		SpringApplication.run(OhjelmistoProjektiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner book(QuestionRepository repository, AnswerRepository arepository) {
		return (args) -> {
			arepository.save(new Answer("Mies"));
			arepository.save(new Answer("2"));
			arepository.save(new Answer ("Ohjelmistotuotanto"));
			arepository.save(new Answer ("En"));
			arepository.save(new Answer ("En osaa sanoa"));
			arepository.save(new Answer ("Marvel App"));
			arepository.save(new Answer ("Photoshop"));
			arepository.save(new Answer ("Intensiivikurssi"));
			arepository.save(new Answer ("En"));
			
			
			Question question = new Question("1. Sukupuoli?", arepository.findByAnswer("En").get(0));
			repository.save(question);
			
			question = new Question("2.Monetta vuotta opiskelet Haaga-Heliassa?", arepository.findByAnswer("2").get(0));
			repository.save(question);
			
			question = new Question("3.Mihin koulutusohjelman linjaan suuntaudut?", arepository.findByAnswer("Ohjelmistotuotanto").get(0));
			repository.save(question);
			
			question = new Question("4.Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?", arepository.findByAnswer("En").get(0));
			repository.save(question);
			
			question = new Question("5.Onko Haaga-Heliassa mielestäsi tarpeeksi visuaaliseen suunnitteluun ohjaavia kursseja?", arepository.findByAnswer("En osaa sanoa").get(0));
			repository.save(question);
			
			question = new Question("6.Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?", arepository.findByAnswer("Marvel App").get(0));
			repository.save(question);
			
			question = new Question("7.Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?", arepository.findByAnswer("Photoshop").get(0));
			repository.save(question);
			
			question = new Question("8.Miten toivoisit työkaluja opetettavan?", arepository.findByAnswer("Intensiivikurssi").get(0));
			repository.save(question);
			
			question = new Question("9.Oletko suorittanut UX/UI suunnittelu kursseja jonkin muun koulun/palvelun kautta?", arepository.findByAnswer("En").get(0));
			repository.save(question);
		};
	}

}