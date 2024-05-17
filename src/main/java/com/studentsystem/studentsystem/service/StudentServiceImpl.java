package com.studentsystem.studentsystem.service;

import com.studentsystem.studentsystem.model.Student;
import com.studentsystem.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    //2.autowired
    @Autowired
    private StudentRepository studentRepository; //insert StudentRepo into service

//    1.for override click ctrl + o
    @Override
    public Student saveStudent(Student student) {
//        return null; change the null to save
        return studentRepository.save(student);
    }
    // to override alt+insert

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(); // all the data from db
    }

}
