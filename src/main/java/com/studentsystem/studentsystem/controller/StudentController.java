package com.studentsystem.studentsystem.controller;

import com.studentsystem.studentsystem.model.Student;
import com.studentsystem.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //get response body
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired //inject student service
    private StudentService studentService;

    //save the data into DB
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
