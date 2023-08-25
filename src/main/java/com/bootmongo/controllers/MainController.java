package com.bootmongo.controllers;

import com.bootmongo.models.Student;
import com.bootmongo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MainController {

    @Autowired
    private StudentRepository studentRepository;

    //handler for add student into database
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {

        return ResponseEntity.ok(this.studentRepository.save(student));
    }

    //handler for get all students from database
    @GetMapping("/")
    public ResponseEntity<?> getStudents() {

        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
