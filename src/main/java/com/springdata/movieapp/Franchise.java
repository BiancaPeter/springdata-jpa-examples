package com.springdata.movieapp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Franchise {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "franchise", cascade = CascadeType.ALL)
    List<Movie> movies;

    public Franchise(String name) {
        this.name = name;
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

    public List<Movie> getMovies() {
        if (this.movies == null) {
            this.movies = new ArrayList<>();
        }
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Franchise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
