package com.example.OhjelmistoProjekti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.OhjelmistoProjekti.domain.Question;
import com.example.OhjelmistoProjekti.domain.QuestionRepository;
import com.example.OhjelmistoProjekti.domain.Sukupuoli;
import com.example.OhjelmistoProjekti.domain.SukupuoliRepository;
import com.example.OhjelmistoProjekti.domain.Suoritus;
import com.example.OhjelmistoProjekti.domain.SuoritusRepository;
import com.example.OhjelmistoProjekti.domain.Toivomus;
import com.example.OhjelmistoProjekti.domain.ToivomusRepository;
import com.example.OhjelmistoProjekti.domain.Tyollistyminen;
import com.example.OhjelmistoProjekti.domain.TyollistyminenRepository;
import com.example.OhjelmistoProjekti.domain.Työkalu;
import com.example.OhjelmistoProjekti.domain.TyökaluRepository;
import com.example.OhjelmistoProjekti.domain.Vuosi;
import com.example.OhjelmistoProjekti.domain.VuosiRepository;
import com.example.OhjelmistoProjekti.domain.Answer;
import com.example.OhjelmistoProjekti.domain.AnswerRepository;
import com.example.OhjelmistoProjekti.domain.Kaipaus;
import com.example.OhjelmistoProjekti.domain.KaipausRepository;
import com.example.OhjelmistoProjekti.domain.Opetusohjelma;
import com.example.OhjelmistoProjekti.domain.OpetusohjelmaRepository;

@SpringBootApplication
public class OhjelmistoProjektiApplication {
	private static final Logger log = LoggerFactory.getLogger(OhjelmistoProjektiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OhjelmistoProjektiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner questionDemo(QuestionRepository qrepository, AnswerRepository arepository, SukupuoliRepository srepository, VuosiRepository vrepository, OpetusohjelmaRepository orepository, TyollistyminenRepository trepository, TyökaluRepository krepository, KaipausRepository irepository, ToivomusRepository mrepository, SuoritusRepository rrepository) {
		return (args) -> {
			log.info("kokeilu");
			
			rrepository.save(new Suoritus("Kyllä, minkä?"));
			rrepository.save(new Suoritus("En"));
			
			
			mrepository.save(new Toivomus("Kurssi aiheesta"));
			mrepository.save(new Toivomus("Jonkin muun kurssin sisällä"));
			mrepository.save(new Toivomus("Intensiivikurssi"));
			
			irepository.save(new Kaipaus("Marvel App"));
			irepository.save(new Kaipaus("inVision"));
			irepository.save(new Kaipaus("Photoshop"));
			irepository.save(new Kaipaus("Illustrator"));
			irepository.save(new Kaipaus("InDesign"));
			irepository.save(new Kaipaus("Adobe XD"));
			irepository.save(new Kaipaus("En osaa sanoa/En kaipaa opetusta näistä."));
			irepository.save(new Kaipaus("Jotain muita mitä?"));
			
			krepository.save(new Työkalu("Marvel App"));
			krepository.save(new Työkalu("inVision"));
			krepository.save(new Työkalu("Photoshop"));
			krepository.save(new Työkalu("Illustrator"));
			krepository.save(new Työkalu("InDesign"));
			krepository.save(new Työkalu("Adobe XD"));
			krepository.save(new Työkalu("En ole käyttänyt"));
			krepository.save(new Työkalu("Jotain muita, mitä?"));
			
			trepository.save(new Tyollistyminen ("En"));
			trepository.save(new Tyollistyminen ("En, mutta olen kiinnostunut oppimaan aiheesta."));
			trepository.save(new Tyollistyminen ("Kyllä"));
			trepository.save(new Tyollistyminen ("Ehkä"));
			
			orepository.save(new Opetusohjelma ("Ohjelmistotuotanto"));
			orepository.save(new Opetusohjelma ("Digipalvelut"));
			orepository.save(new Opetusohjelma ("Infrastruktuuri"));
			orepository.save(new Opetusohjelma ("Liiketoiminta"));
			
			vrepository.save(new Vuosi ("1"));
			vrepository.save(new Vuosi ("2"));
			vrepository.save(new Vuosi ("3"));
			vrepository.save(new Vuosi ("4+"));
			vrepository.save(new Vuosi ("Alumni"));
			
			srepository.save(new Sukupuoli ("Mies"));
			srepository.save(new Sukupuoli ("Nainen"));
			srepository.save(new Sukupuoli ("Muu"));
			
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