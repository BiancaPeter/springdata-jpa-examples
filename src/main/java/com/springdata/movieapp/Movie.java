package com.springdata.movieapp;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "franchise_id")
    Franchise franchise;

    @ManyToMany
    @JoinTable(
            name = "movie_character",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private Set<Character> characters;

    public Movie(String name, Set<Character> characters) {
        this.name = name;
        this.characters = characters;
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

    public Set<Character> getCharacters() {
        if (this.characters == null) {
            this.characters = new HashSet<>();
        }
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }
}
