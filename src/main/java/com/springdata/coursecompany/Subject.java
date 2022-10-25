package com.springdata.coursecompany;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

    public Subject(String name, Session session) {
        this.name = name;
        this.session = session;
    }

    public Subject(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
