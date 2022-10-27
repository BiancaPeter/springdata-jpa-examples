package com.springdata.movieapp;

import com.springdata.twitterapp.Comment;
import com.springdata.twitterapp.Tweet;
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

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public Movie addCharacterToMovie(Movie movie, Character character) {
        character.getMovies().add(movie);
        movie.getCharacters().add(character);
        return movieRepository.save(movie);
    }
}
