package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {
    private FranchiseService franchiseService;
    private MovieService movieService;
    private CharacterService characterService;


    public Runner(@Autowired FranchiseService franchiseService, @Autowired MovieService movieService, @Autowired CharacterService characterService) {
        this.franchiseService = franchiseService;
        this.movieService = movieService;
        this.characterService = characterService;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie1 = new Movie("Avatar");
        Movie savedMovie1 = movieService.saveMovie(movie1);

        Character character1 = new Character("Zoe Saldana");
        Movie edited1Movie1 = movieService.addCharacterToMovie(savedMovie1, character1);

        Character character2 = new Character("Sam Worthington");
        Movie edited2Movie1 = movieService.addCharacterToMovie(edited1Movie1, character2);

        Character character3 = new Character("Sigourney Weaver");
        Movie edited3Movie1 = movieService.addCharacterToMovie(edited2Movie1, character3);

        Franchise franchise1 = new Franchise("AV");
        Franchise savedFranchise1 = franchiseService.saveFranchise(franchise1);
        Franchise editedFranchise1 = franchiseService.addMovieToFranchise(savedFranchise1, edited3Movie1);

        //-----------------
        Movie movie2 = new Movie("Inception");
        Movie savedMovie2 = movieService.saveMovie(movie2);

        Character character4 = new Character("Leonardo DiCaprio");
        Movie edited1Movie2 = movieService.addCharacterToMovie(savedMovie2, character4);

        Character character5 = new Character("Joseph Gordon-Levitt");
        Movie edited2Movie2 = movieService.addCharacterToMovie(edited1Movie2, character5);

        Character character6 = new Character("Cillian Murphy");
        Movie edited3Movie2 = movieService.addCharacterToMovie(edited2Movie2, character6);

        Franchise franchise2 = new Franchise("Leo");
        Franchise savedFranchise2 = franchiseService.saveFranchise(franchise2);
        Franchise editedFranchise2 = franchiseService.addMovieToFranchise(savedFranchise2, edited3Movie2);


//      //---------------
        System.out.println("All movie by franchise "+ movieService.findAllByFranchise(editedFranchise2));
        System.out.println("All character by movie "+ characterService.findAllByMovie(edited3Movie2));

    }
}
