package com.onesa.SecurityEx.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesa.SecurityEx.core.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/student")
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student("John", "Computer Science", 25),
            new Student("Jane", "Mathematics", 22)));

    @GetMapping
    public List<Student> getStudents() {
        return students;

    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}