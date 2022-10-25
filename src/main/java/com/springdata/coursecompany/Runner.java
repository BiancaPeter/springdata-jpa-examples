package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {
    private LocationService locationService;
    private ModuleService moduleService;
    private PresenceService presenceService;
    private SessionService sessionService;
    private SubjectService subjectService;
    private TeamService teamService;
    private UserService userService;

    public Runner(@Autowired LocationService locationService,@Autowired ModuleService moduleService,@Autowired PresenceService presenceService,@Autowired SessionService sessionService,@Autowired SubjectService subjectService,@Autowired TeamService teamService,@Autowired UserService userService) {
        this.locationService = locationService;
        this.moduleService = moduleService;
        this.presenceService = presenceService;
        this.sessionService = sessionService;
        this.subjectService = subjectService;
        this.teamService = teamService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
