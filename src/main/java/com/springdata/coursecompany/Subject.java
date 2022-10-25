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

    public Subject(){}
}
