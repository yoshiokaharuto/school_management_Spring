package com.example.school_management.mapper;

import com.example.school_management.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM departments WHERE school_id = #{schoolId}")
    List<Department> selectAllDepartment(long schoolId);

    @Insert("INSERT INTO departments (department_name,years,school_id) VALUES (#{departmentName},#{years},#{schoolId})")
    void insertDepartment(Department department);

    @Delete("DELETE FROM departments WHERE department_id = #{departmentId}")
    void deleteDepartment(long departmentId);

    @Select("SELECT * FROM departments WHERE department_id = #{departmentId}")
    Department selectDepartmentById(long departmentId);

    @Update("UPDATE departments SET department_name = #{departmentName}, years = #{years} WHERE department_id = #{departmentId}")
    void updateDepartment(Department department);
}
