package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {
    private FranchiseService franchiseService;
    private MovieService movieService;
    private CharacterService characterService;

    @Autowired
    private FranchiseRepository franchiseRepository;

    public Runner(@Autowired FranchiseService franchiseService, @Autowired MovieService movieService, @Autowired CharacterService characterService) {
        this.franchiseService = franchiseService;
        this.movieService = movieService;
        this.characterService = characterService;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie1 = new Movie("Avatar");
        Movie savedMovie = movieService.saveMovie(movie1);
//---------------
//        Character character1 = new Character("Zoe Saldana");
//        Movie editedMovie = movieService.addCharacterToMovie(movie1, character1);


    Character character1 = new Character("Zoe Saldana");
    Movie editedMovie = movieService.addCharacterToMovie(savedMovie,character1);

    Franchise franchise = new Franchise("AV");
    franchiseRepository.save(franchise);
    Franchise saveFranchise = franchiseService.addMovieToFranchise(franchise,editedMovie);

    }
}
