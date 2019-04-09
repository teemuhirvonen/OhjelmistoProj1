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
			
			arepository.save(new Answer ("Mies", qrepository.findByQuestion("Sukupuoli?").get(0)));
			arepository.save(new Answer ("Nainen", qrepository.findByQuestion("Sukupuoli?").get(0)));
			arepository.save(new Answer ("Muu", qrepository.findByQuestion("Sukupuoli?").get(0)));
			
			arepository.save(new Answer ("1", qrepository.findByQuestion("Monetta vuotta opiskelet Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("2", qrepository.findByQuestion("Monetta vuotta opiskelet Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("3", qrepository.findByQuestion("Monetta vuotta opiskelet Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("4+", qrepository.findByQuestion("Monetta vuotta opiskelet Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("Alumni", qrepository.findByQuestion("Monetta vuotta opiskelet Haaga-Heliassa?").get(0)));
			
			arepository.save(new Answer ("Ohjelmistotuotanto", qrepository.findByQuestion("Mihin koulutusohjelman linjaan suuntaudut?").get(0)));
			arepository.save(new Answer ("Digipalvelut", qrepository.findByQuestion("Mihin koulutusohjelman linjaan suuntaudut?").get(0)));
			arepository.save(new Answer ("Infrastruktuuri", qrepository.findByQuestion("Mihin koulutusohjelman linjaan suuntaudut?").get(0)));
			arepository.save(new Answer ("Liiketoiminta", qrepository.findByQuestion("Mihin koulutusohjelman linjaan suuntaudut?").get(0)));
			
			arepository.save(new Answer ("En", qrepository.findByQuestion("Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?").get(0)));
			arepository.save(new Answer ("En, mutta olen kiinnostunut oppimaan aiheesta", qrepository.findByQuestion("Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?").get(0)));
			arepository.save(new Answer ("Kyllä", qrepository.findByQuestion("Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?").get(0)));
			arepository.save(new Answer ("Ehkä", qrepository.findByQuestion("Haluaisitko työllistyä UI/UX suunnittelun työtehtäviin?").get(0)));
			
			arepository.save(new Answer ("", qrepository.findByQuestion("Onko Haaga-Heliassa mielestäsi tarpeeksi visuaaliseen suunnitteluun ohjaavia kursseja?").get(0)));
			
			arepository.save(new Answer ("Marvel App", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("inVision", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("Photoshop", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("Illustrator", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("InDesign", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("Adobe XD", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("En ole käyttänyt", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("Jotain muita, mitä?", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			arepository.save(new Answer ("", qrepository.findByQuestion("Mitä suunnittelutyökaluja olet käyttänyt Haaga-Heliassa?").get(0)));
			
			arepository.save(new Answer ("Marvel App", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("inVision", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("Photoshop", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("Illustrator", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("InDesign", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("Adobe XD", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("En osaa sanoa/En kaipaa opetusta näistä", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("Jotain muita, mitä?", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			arepository.save(new Answer ("", qrepository.findByQuestion("Minkä visuaalisten työkalujen opetusta kaipaisit Haaga-Heliaan?").get(0)));
			
			arepository.save(new Answer ("Kurssi aiheesta", qrepository.findByQuestion("Miten toivoisit työkaluja opetettavan?").get(0)));
			arepository.save(new Answer ("Jonkin muun kurssin sisällä", qrepository.findByQuestion("Miten toivoisit työkaluja opetettavan?").get(0)));
			arepository.save(new Answer ("Intensiivikurssi", qrepository.findByQuestion("Miten toivoisit työkaluja opetettavan?").get(0)));
	
			arepository.save(new Answer ("Kyllä", qrepository.findByQuestion("Oletko suorittanut UX/UI suunnittelu kursseja jonkin muun koulun/palvelun kautta?").get(0)));
			arepository.save(new Answer ("", qrepository.findByQuestion("Oletko suorittanut UX/UI suunnittelu kursseja jonkin muun koulun/palvelun kautta?").get(0)));
			arepository.save(new Answer ("En", qrepository.findByQuestion("Oletko suorittanut UX/UI suunnittelu kursseja jonkin muun koulun/palvelun kautta?").get(0)));
			
			log.info("nouto");
			for (Answer answer : arepository.findAll()){
				log.info(answer.toString());
			}
		};
	}

}