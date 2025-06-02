package com.example.school_management.repository;

import com.example.school_management.entity.Department;
import com.example.school_management.mapper.DepartmentMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository {
    private final DepartmentMapper departmentMapper;

    public DepartmentRepository(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public List<Department> selectAllDepartment(long schoolId){
        return departmentMapper.selectAllDepartment(schoolId);
    }

    public  void insertDepartment(Department department){
        departmentMapper.insertDepartment(department);
    }

    public void deleteDepartment(long departmentId){
        departmentMapper.deleteDepartment(departmentId);
    }

    public Department selectDepartmentById(long departmentId){
        return departmentMapper.selectDepartmentById(departmentId);
    }
    public void updateDepartment(Department department){
        departmentMapper.updateDepartment(department);
    }
}
