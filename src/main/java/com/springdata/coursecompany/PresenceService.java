package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresenceService {

    private PresenceRepository presenceRepository;

    public PresenceService(@Autowired PresenceRepository presenceRepository) {
        this.presenceRepository = presenceRepository;
    }
}
