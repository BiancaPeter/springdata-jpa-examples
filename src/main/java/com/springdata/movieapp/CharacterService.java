package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;

    private MovieRepository movieRepository;

    public CharacterService(@Autowired CharacterRepository characterRepository,@Autowired MovieRepository movieRepository) {
        this.characterRepository = characterRepository;
        this.movieRepository = movieRepository;
    }

    public List<Character>findAllByMovie(Movie movie){
        return characterRepository.findAllByMoviesIs(movie);
    }
}
