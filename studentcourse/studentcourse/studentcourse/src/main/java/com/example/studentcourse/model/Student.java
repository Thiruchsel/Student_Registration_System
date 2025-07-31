package com.example.studentcourse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String gender;
    private String dept;
    Student(int id,String name,String gender,String dept){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.dept=dept;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public String getDept() {return dept;}
    public void setDept(String dept) {this.dept = dept;}
    public Student(){

    }

//    @Override
//    public String toString(){
//        return "id"+id+"name"+name+"gender"+gender+"dept"+dept;
//    }
}
