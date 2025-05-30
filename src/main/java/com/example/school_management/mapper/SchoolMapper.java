package com.example.school_management.mapper;

import com.example.school_management.entity.School;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface SchoolMapper {

    @Select("SELECT * FROM schools")
    List<School> selectAllSchools();

    @Insert("INSERT INTO schools (school_name,address,tel) VALUES (#{schoolName},#{address},#{tel})")
    void insertSchool(School school);

    @Select("SELECT * FROM schools WHERE school_id = #{schoolId}")
    School selectSchoolById(long id);
}
