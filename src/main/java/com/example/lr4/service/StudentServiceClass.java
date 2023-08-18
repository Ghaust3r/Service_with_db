package com.example.lr4.service;


import com.example.lr4.dao.StudentDao;
import com.example.lr4.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceClass implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    @Transactional
    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
    @Override
    @Transactional
    public Student getStudent(int id){
        return studentDao.getStudent(id);
    }
    @Override
    @Transactional
    public Student saveStudent(Student student){
        return studentDao.saveStudent(student);
    }
    @Override
    @Transactional
    public void  deleteStudent(int id){
        studentDao.deleteStudent(id);
    }
}
