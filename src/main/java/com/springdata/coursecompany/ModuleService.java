package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {

    private ModuleRepository moduleRepository;

    private SessionRepository sessionRepository;

    public ModuleService(@Autowired ModuleRepository moduleRepository,@Autowired SessionRepository sessionRepository) {
        this.moduleRepository = moduleRepository;
        this.sessionRepository = sessionRepository;
    }
}
