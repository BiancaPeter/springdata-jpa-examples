package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private TeamRepository teamRepository;
    private UserRepository userRepository;
    private ModuleRepository moduleRepository;

    public TeamService(@Autowired TeamRepository teamRepository,@Autowired UserRepository userRepository,@Autowired ModuleRepository moduleRepository) {
        this.teamRepository = teamRepository;
        this.userRepository = userRepository;
        this.moduleRepository = moduleRepository;
    }

    public Team saveTeam(Team team){
        return teamRepository.save(team);
    }
}
