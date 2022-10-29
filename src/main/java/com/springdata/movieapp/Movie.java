package com.springdata.movieapp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Movies")
public class Movie {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "franchise_id")
    Franchise franchise;

    @ManyToMany( cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "movie_character",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private List<Character> characters;

    public Movie(String name) {
        this.name = name;
    }

    public Movie() {
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

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public List<Character> getCharacters() {
        if (this.characters == null) {
            this.characters = new ArrayList<>();
        }
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", franchise=" + franchise +
                ", characters=" + characters +
                '}';
    }
}
