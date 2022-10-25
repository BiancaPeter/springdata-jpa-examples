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
}
