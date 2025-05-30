package com.example.school_management.entity;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Department {
    private long departmentId;
    private String departmentName;
    private long years;
    private long schoolId;
    private LocalTime createdAt;
}
