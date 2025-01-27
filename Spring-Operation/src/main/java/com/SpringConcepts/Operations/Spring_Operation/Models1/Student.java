package com.SpringConcepts.Operations.Spring_Operation.Models1;

import jakarta.persistence.*;

@Entity
public class Student {


    @Id
    @Column(length = 50)
    private String id;

    private String name;
    private String lname;

    public Student() {}

    public Student(String id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
