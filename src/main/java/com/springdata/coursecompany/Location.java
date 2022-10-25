package com.springdata.coursecompany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String street;

    @Column
    private int number;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private Set<Session> sessions;

    public Location(String name, String street, int number, Set<Session> sessions) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.sessions = sessions;
    }

    public Location(String name, String street, int number) {
        this.name = name;
        this.street = street;
        this.number = number;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set<Session> getSessions() {
        if (this.sessions == null) {
            this.sessions = new HashSet<>();
        }
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }
}
