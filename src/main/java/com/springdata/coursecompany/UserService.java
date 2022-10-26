package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

    private UserRepository userRepository;

    private TeamRepository teamRepository;

    private ModuleRepository moduleRepository;

    public UserService(@Autowired UserRepository userRepository, @Autowired TeamRepository teamRepository, @Autowired ModuleRepository moduleRepository) {
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
        this.moduleRepository = moduleRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public Set<Module> findUserModules(User user) {
        Team team = user.getTeam();
        return team.getModules();
    }
}
