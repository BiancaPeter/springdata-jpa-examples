package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;

    private MovieRepository movieRepository;

    public CharacterService(@Autowired CharacterRepository characterRepository,@Autowired MovieRepository movieRepository) {
        this.characterRepository = characterRepository;
        this.movieRepository = movieRepository;
    }
}
