package com.springdata.movieapp;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Characters")
public class Character {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "characters", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Movie> movies ;

    public Character(String name) {
        this.name = name;
    }

    public Character() {
    }

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
}
