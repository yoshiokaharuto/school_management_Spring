package com.example.school_management.service;

import com.example.school_management.entity.Department;
import com.example.school_management.form.DepartmentForm;
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

    public  void insertDepartment(DepartmentForm departmentForm){
        Department department = new Department();

        department.setDepartmentName(departmentForm.getDepartmentName());
        department.setYears(departmentForm.getYears());
        department.setSchoolId(departmentForm.getSchoolId());

        departmentRepository.insertDepartment(department);
    }

    public void deleteDepartment(long departmentId){
        departmentRepository.deleteDepartment(departmentId);
    }

    public Department selectDepartmentById(long departmentId){
        return departmentRepository.selectDepartmentById(departmentId);
    }
    public void updateDepartment(long departmentId,Department department){
        if(departmentId != department.getDepartmentId()){
            throw new IllegalArgumentException("Music Id does not match");
        }
        departmentRepository.updateDepartment(department);
    }
}
