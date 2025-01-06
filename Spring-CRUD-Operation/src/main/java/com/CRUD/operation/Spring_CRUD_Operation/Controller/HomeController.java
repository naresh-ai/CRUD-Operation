package com.CRUD.operation.Spring_CRUD_Operation.Controller;

import com.CRUD.operation.Spring_CRUD_Operation.Model.Student;
import com.CRUD.operation.Spring_CRUD_Operation.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HomeController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
   // @CrossOrigin(origins = "http://127.0.0.1:5500")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudents")

    //crossorgn used for share  specfc mthod

    //@CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/updateStudent")

    public Student updateStudent(@RequestBody Student student) {
        return studentService.udpateStudent(student);
    }

    @GetMapping("/deleteStudent/{id}")



    public Boolean deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}