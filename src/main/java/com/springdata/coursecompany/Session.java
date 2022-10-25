package com.springdata.coursecompany;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Entity
public class Session {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalTime startTime;

    @Column
    private LocalTime endTime;

    @Column
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "session",cascade = CascadeType.ALL)
    List<Subject> subjects;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "session")
    private Set<Presence> presences;

    public Session(){}
}
