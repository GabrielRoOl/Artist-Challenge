package br.com.challenge.artist;

import br.com.challenge.artist.application.ShowMenu;
import br.com.challenge.artist.repositories.ArtistRepository;
import br.com.challenge.artist.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtistApplication implements CommandLineRunner {

	@Autowired
	private ArtistService artistService;

	public static void main(String[] args) {
		SpringApplication.run(ArtistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ShowMenu showMenu = new ShowMenu(artistService);
		showMenu.menu();

	}
}
