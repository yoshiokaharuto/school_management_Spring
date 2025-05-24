package com.example.school_management.mapper;

import com.example.school_management.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolMapper {

    @Select("SELECT * FROM schools")
    List<School> selectALLSchools();
}
