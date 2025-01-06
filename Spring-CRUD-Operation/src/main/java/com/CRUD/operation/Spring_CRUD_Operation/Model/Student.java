package com.CRUD.operation.Spring_CRUD_Operation.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private int age;
    private String dept;


    public Student(int id, String name, int age, String dept) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }


    public Student() {
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
}