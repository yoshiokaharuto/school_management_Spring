package com.example.school_management.mapper;

import com.example.school_management.entity.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM departments WHERE school_id = #{schoolId}")
    List<Department> selectAllDepartment(long schoolId);

    @Insert("INSERT INTO departments (department_name,years,school_id) VALUES (#{departmentName},#{years},#{schoolId})")
    void insertDepartment(Department department);

    @Delete("DELETE FROM departments WHERE department_id = #{departmentId}")
    void deleteDepartment(long departmentId);
}
