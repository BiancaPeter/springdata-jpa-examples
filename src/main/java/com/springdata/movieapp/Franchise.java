package com.springdata.movieapp;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Franchise {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "franchise", cascade = CascadeType.ALL)
    Set<Movie> movies;

    public Franchise(String name, Set<Movie> movies) {
        this.name = name;
        this.movies = movies;
    }

    public Franchise(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        if (this.movies == null) {
            this.movies = new HashSet<>();
        }
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
