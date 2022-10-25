package com.springdata.coursecompany;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "location",cascade = CascadeType.ALL)
    List<Session> sessions;

    public Location(){}
}
