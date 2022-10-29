package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private TeamRepository teamRepository;
    private UserRepository userRepository;

    public TeamService(@Autowired TeamRepository teamRepository, @Autowired UserRepository userRepository) {
        this.teamRepository = teamRepository;
        this.userRepository = userRepository;
    }

    public Team addUserToTeam(Long userId, Long teamId) {
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new IllegalArgumentException());
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException());
        team.getUsers().add(user);
        user.setTeam(team);
        return teamRepository.save(team);
    }

    public Team addUserToTeam(User user, Team team) {
        team.getUsers().add(user);
        user.setTeam(team);
        return teamRepository.save(team);
    }

    public Team addModuleToTeam(Module module, Team team) {
        team.getModules().add(module);
        module.setTeam(team);
        return teamRepository.save(team);
    }

    public void removeUserFromTeam(User user, Team team) {
        team.getUsers().remove(user);
        userRepository.delete(user);
    }


}
