package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {
    private FranchiseService franchiseService;
    private MovieService movieService;
    private CharacterService characterService;

    public Runner(@Autowired FranchiseService franchiseService,@Autowired MovieService movieService,@Autowired CharacterService characterService) {
        this.franchiseService = franchiseService;
        this.movieService = movieService;
        this.characterService = characterService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
