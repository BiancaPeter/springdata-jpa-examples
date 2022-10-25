package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private SubjectRepository subjectRepository;
    private PresenceRepository presenceRepository;

    public UserService(@Autowired UserRepository userRepository,@Autowired SubjectRepository subjectRepository,@Autowired PresenceRepository presenceRepository) {
        this.userRepository = userRepository;
        this.subjectRepository = subjectRepository;
        this.presenceRepository = presenceRepository;
    }
}
