package com.example.lr4.controller;


import com.example.lr4.entity.Student;
import com.example.lr4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {


    @Qualifier("studentServiceClass")
    @Autowired
    private StudentService studentServise;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentServise.getAllStudents();
        return allStudents;
    }
    @GetMapping("/students/{id}")
    public  Student GetStudent(@PathVariable("id") int id) {
        return studentServise.getStudent(id);
    }
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentServise.saveStudent(student);
    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentServise.saveStudent(student);
        return student;
    }
    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") int id){
        studentServise.deleteStudent(id);
    }
}