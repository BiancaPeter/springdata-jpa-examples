package com.springdata.coursecompany;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String emailAddress;

    @Column
    private Role role;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Session> sessions;


    @OneToMany(mappedBy = "user")
    private Set<Presence> presences;

    public User(){}
}
