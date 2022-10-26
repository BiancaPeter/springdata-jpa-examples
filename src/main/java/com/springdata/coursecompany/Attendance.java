package com.springdata.coursecompany;

import javax.persistence.*;

@Entity
public class Attendance {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="attendance_status")
    private Status status;

    @ManyToOne
    @JoinColumn(name="student_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;

    public Attendance(){}

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
