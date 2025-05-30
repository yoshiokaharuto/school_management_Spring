package com.example.school_management.repository;

import com.example.school_management.entity.School;
import com.example.school_management.mapper.SchoolMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolRepository {
    private final SchoolMapper schoolMapper;

    public SchoolRepository(SchoolMapper schoolMapper) {
        this.schoolMapper = schoolMapper;
    }

    public List<School> getAllSchools() {
        return schoolMapper.selectAllSchools();
    }

    public void insertSchool(School school){
        schoolMapper.insertSchool(school);
    }

    public School selectSchoolById(long schoolId){
        return schoolMapper.selectSchoolById(schoolId);
    }

    public void deleteSchoolById(long id) {
        schoolMapper.deleteSchoolById(id);
    }
}

