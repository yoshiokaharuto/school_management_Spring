package com.example.school_management.mapper;

import com.example.school_management.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM departments WHERE school_id = #{schoolId}")
    List<Department> selectAllDepartment(long schoolId);
}
