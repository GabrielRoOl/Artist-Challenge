package br.com.challenge.artist.application;

import br.com.challenge.artist.enums.Gender;
import br.com.challenge.artist.model.Artist;
import br.com.challenge.artist.services.ArtistService;

import java.util.Scanner;

public class ShowMenu {

    private final ArtistService artistService;

    private Scanner sc = new Scanner(System.in);

    public ShowMenu(ArtistService artistService) {
        this.artistService = artistService;
    }

    public void menu(){


        var show = """
                *** Screen Sound Músicas ***

                1- Register artist
                2- Register songs
                3- List songs
                4- Search songs by artist
                5- Search for data about an artist
                
                9 - Exit
                """;

        var option = -1;

        while(option != 0){
            System.out.println(show);
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 9:
                    System.out.println("Leaving ...");
                    System.exit(9);
                    break;
                case 1:
                    registerArtist();
                    break;
                case 2:
                    registerMusic();
                    break;
                default:
                    System.out.println("Invalid option..");
                    break;

            }
        }
    }

    private void registerMusic() {
        System.out.println();

    }

    private void registerArtist() {
        var newRegister = "S";

        while(newRegister.equalsIgnoreCase("S")) {
            System.out.print("What's the artist's name? ");
            var name = sc.nextLine();

            System.out.print("What's the musical genre: (solo, duo or band)? ");
            var genre = sc.nextLine();

            Artist artist = new Artist(name, Gender.valueOf(genre.toUpperCase()));

            artistService.saveArtist(artist);

            System.out.println("Artist " + name + " successfully.");

            System.out.println("Do you want register another artist? (S/N)");
            newRegister = sc.nextLine();
        }
    }


}
