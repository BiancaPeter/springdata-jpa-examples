package com.springdata.coursecompany;

import javax.persistence.*;

@Entity
public class Presence {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Status status;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;

    public Presence(){}

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
