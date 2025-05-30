package com.example.school_management.controller;

import com.example.school_management.entity.School;
import com.example.school_management.form.SchoolForm;
import com.example.school_management.service.SchoolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/schools")
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public String getSchools(Model model) {
        List<School> schools = schoolService.getAllSchools();
        model.addAttribute("schools", schools);
        return "school/school-list";
    }

    //学校登録
    @GetMapping("/register")
    public String registerSchoolForm(Model model) {
        SchoolForm schoolForm = new SchoolForm();
        model.addAttribute("schoolForm", schoolForm);
        return "school/school-register";
    }

    @PostMapping("/register")
    public String registerSchool(SchoolForm schoolForm,Model model){
        schoolService.createSchool(schoolForm);
        return "redirect:/schools";
    }

    @GetMapping("/{schoolId}")
    public String schoolDetail(@PathVariable long schoolId,Model model){
        School school = schoolService.selectSchoolById(schoolId);
        model.addAttribute("school", school);
        return "school/school-detail";
    }

    @PostMapping("{schoolId}/delete")
    public String deleteSchool(@PathVariable long schoolId){
        schoolService.deleteSchoolById(schoolId);
        return"redirect:/schools";
    }
}
