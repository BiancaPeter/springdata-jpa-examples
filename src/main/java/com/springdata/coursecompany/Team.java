package com.springdata.coursecompany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
    List<Module> modules;

    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
    List<User> users;

    public Team(){}
}
