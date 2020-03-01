package fr.istic.sir.doodle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.istic.sir.doodle.service.interfaces.IdoodleService;

@SpringBootApplication
public class DoodleApplication implements CommandLineRunner {
	@Autowired
	private IdoodleService doodleS;
	
	public static void main(String[] args) {
		SpringApplication.run(DoodleApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// doodleS.createUserTest();
//		doodleS.createSondage();
//		doodleS.createCrenaux();
//		doodleS.validedSondage(); 
//		doodleS. choseDate();
//		doodleS.selectCrenauxforMeeting();
	}
	

}
