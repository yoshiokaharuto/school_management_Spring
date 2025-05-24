package com.example.school_management.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class School {
    private long SchoolId;
    private String SchoolName;
    private String Address;
    private String tel;
    private LocalDateTime created;
}
