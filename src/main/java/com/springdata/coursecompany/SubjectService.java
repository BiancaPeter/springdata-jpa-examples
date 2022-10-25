package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    private SubjectRepository subjectRepository;

    public SubjectService(@Autowired SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
}
