package com.example.studentcourse.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;

import com.example.studentcourse.model.Student;
import com.example.studentcourse.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
//    get mapping start area
    @GetMapping("/student")
    public List<Student> getStudents(){
    return studentService.getStudents();
    }
    @GetMapping("/student/{id}")
    public Student getoneStudent(@PathVariable int id){
     return studentService.getoneStudent(id);
    }
//    end of get mapping
//
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
         studentService.createStudent(student);
    }


    @PutMapping("/updata/{id}")
    public String change(@RequestBody Student student,@PathVariable int id) {
//
        studentService.change(student,id);
        return "done";
    }
    @DeleteMapping("/delet/{id}")
    public String clearone(@PathVariable int id){
        studentService.clearone(id);
        return "dlete";
    }

}
