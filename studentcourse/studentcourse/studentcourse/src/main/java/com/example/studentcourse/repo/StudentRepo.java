package com.example.studentcourse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcourse.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    
}
