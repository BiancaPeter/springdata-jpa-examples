package com.springdata.coursecompany;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    @OneToMany(mappedBy = "module",cascade = CascadeType.ALL)
    List<Session> sessions;

    public Module(){}
}
