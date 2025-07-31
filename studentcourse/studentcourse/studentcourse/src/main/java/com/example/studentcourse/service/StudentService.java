package com.example.studentcourse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcourse.model.Student;
import com.example.studentcourse.repo.StudentRepo;
class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){

    }
//   public ResourceNotFoundException( String ss,int sushg){
//
//    }
}

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
    public void createStudent(Student student) {
       studentRepo.save(student);
       
    }



    public Student getoneStudent(int id) {
      return   studentRepo.findById(id).orElse(new Student());
    }

    public void change(Student student, int id) {
        Optional<Student> op = studentRepo.findById(id);
        if (op.isPresent()) {

            studentRepo.save(student);
        }
        else if (op.isEmpty()) {
            throw new ResourceNotFoundException();
        }

    }

    public void clearone(int id) {
        studentRepo.deleteById(id);
    }


}
