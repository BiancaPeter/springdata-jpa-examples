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
}
