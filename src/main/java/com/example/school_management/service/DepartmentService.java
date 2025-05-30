package com.example.school_management.service;

import com.example.school_management.entity.Department;
import com.example.school_management.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments(long schoolId) {
        return departmentRepository.selectAllDepartment(schoolId);
    }
}
