package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    private SessionRepository sessionRepository;

    private PresenceRepository presenceRepository;

    public SessionService(@Autowired SessionRepository sessionRepository, @Autowired PresenceRepository presenceRepository) {
        this.sessionRepository = sessionRepository;
        this.presenceRepository = presenceRepository;
    }

    public Session saveSession (Session session){
        return sessionRepository.save(session);
    }
}
