package com.example.school_management.service;


import com.example.school_management.entity.School;
import com.example.school_management.form.SchoolForm;
import com.example.school_management.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> getAllSchools() {
        return schoolRepository.getAllSchools();
    }

    public void createSchool(SchoolForm schoolForm) {
        School school = new School();
        school.setSchoolName(schoolForm.getSchoolName());
        school.setAddress(schoolForm.getAddress());
        school.setTel(schoolForm.getTel());
        schoolRepository.insertSchool(school);
    }
}
