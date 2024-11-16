package emsi.moncef.Tp_DataRest;

import emsi.moncef.Tp_DataRest.enums.Gender;
import emsi.moncef.Tp_DataRest.model.Centre;
import emsi.moncef.Tp_DataRest.model.Etudiant;
import emsi.moncef.Tp_DataRest.repository.CentreRepository;
import emsi.moncef.Tp_DataRest.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpDataRestApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TpDataRestApplication.class, args);
	}
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	CentreRepository centreRepository;
	@Override
	public void run(String... args) throws Exception {
		Centre centre1 = Centre.builder()
				.nom("Maarif").adresse("Biranzarane").build();
		centreRepository.save(centre1);
		Centre centre2 = Centre.builder()
				.nom("Oranges").adresse("Oulfa").build();
		centreRepository.save(centre2);
		Etudiant et1 = Etudiant.builder()
				.name("Adnani").prenom("Brahim").gender(Gender.Homme)
				.centre(centre1).build();
		etudiantRepository.save(et1);
	}

}
