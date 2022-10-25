package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    private CharacterRepository characterRepository;

    public MovieService(@Autowired MovieRepository movieRepository, @Autowired CharacterRepository characterRepository) {
        this.movieRepository = movieRepository;
        this.characterRepository = characterRepository;
    }
}
