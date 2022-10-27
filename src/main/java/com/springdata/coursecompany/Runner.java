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

    @Autowired
    private TeamRepository teamRepository;

    public Runner(@Autowired LocationService locationService, @Autowired ModuleService moduleService, @Autowired PresenceService presenceService, @Autowired SessionService sessionService, @Autowired SubjectService subjectService, @Autowired TeamService teamService, @Autowired UserService userService) {
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
        //CREATE OPERATIONS
        User user1 = new User("PopV", "zxcvb", "Victor", "Pop", "popvictor@gmail.com", Role.ADMIN);
        User savedUser = userService.saveUser(user1);
        User user2 = new User("SuciuP", "asdfg", "Paul", "Suciu", "suciupaul@gmail.com", Role.TRAINER);
        userService.saveUser(user2);
        User user3 = new User("NegruC", "tyyui", "Calin", "Negru", "negrucalin@gmail.com", Role.STUDENT);
        userService.saveUser(user3);
        User user4 = new User("CosteaC", "lkjhg", "Claudia", "Costea", "costeaclaudia@gmail.com", Role.STUDENT);
        userService.saveUser(user4);

        //-----------------------------------

        Team team = new Team("grupa1Bucuresti");
        Team savedTeam = teamRepository.save(team);
        Team editedTeam = teamService.addUserToTeam(savedUser, savedTeam);

//
//        Module module = new Module("Java fundamentals", LocalDate.of(2022, 10, 12), LocalDate.of(2022, 10, 25), team);
//        moduleService.saveModule(module);
//
//        Location location = new Location("Biroul1", "Eroilor", 10);
//        locationService.saveLocation(location);
//
//        Session session = new Session(LocalTime.of(18, 00), LocalTime.of(20, 30), LocalDate.of(2022, 10, 12), location, module, user2);
//        sessionService.saveSession(session);
//
//        Subject subject = new Subject("Variabile", session);
//        subjectService.saveSubject(subject);


        //adauga module la echipa

        User user = userService.findUserById(1L);
        userService.findUserModules(user);


    }
}
