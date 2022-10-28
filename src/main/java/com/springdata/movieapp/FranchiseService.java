package com.springdata.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchiseService {

    private FranchiseRepository franchiseRepository;

    private MovieRepository movieRepository;

    public FranchiseService(@Autowired FranchiseRepository franchiseRepository,@Autowired MovieRepository movieRepository) {
        this.franchiseRepository = franchiseRepository;
        this.movieRepository = movieRepository;
    }

    public Franchise saveFranchise(Franchise franchise){
        return franchiseRepository.save(franchise);
    }

    public Franchise addMovieToFranchise(Franchise franchise, Movie movie) {
        movie.setFranchise(franchise);
        franchise.getMovies().add(movie);
        return franchiseRepository.save(franchise);
    }
}
