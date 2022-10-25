package com.springdata.coursecompany;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
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

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private Set<Subject> subjects;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(mappedBy = "session")
    private Set<Presence> presences;

    public Session(LocalTime startTime, LocalTime endTime, LocalDate date, Location location, Module module, User user) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.location = location;
        this.module = module;
        this.user = user;
    }

    public Session() {
    }

    public Long getId() {
        return id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Subject> getSubjects() {
        if (this.subjects == null) {
            this.subjects = new HashSet<>();
        }
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Presence> getPresences() {
        if (this.presences == null) {
            this.presences = new HashSet<>();
        }
        return presences;
    }

    public void setPresences(Set<Presence> presences) {
        this.presences = presences;
    }
}
