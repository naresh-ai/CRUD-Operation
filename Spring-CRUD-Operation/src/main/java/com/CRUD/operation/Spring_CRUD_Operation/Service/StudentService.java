package com.CRUD.operation.Spring_CRUD_Operation.Service;

import com.CRUD.operation.Spring_CRUD_Operation.Model.Student;
import com.CRUD.operation.Spring_CRUD_Operation.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 @Service
public class StudentService {

        @Autowired
        private StudentRepo studentRepo;

        public Student addStudent(Student student) {
            return studentRepo.save(student);
        }

        public List<Student> getAllStudents() {
            return studentRepo.findAll();
        }

        public Student udpateStudent(Student updatedStudent) {
            Optional<Student> student1 = studentRepo.findById(updatedStudent.getId());
            Student student = student1.get();
            student.setAge(updatedStudent.getAge());
            student.setDept(updatedStudent.getDept());
            student.setName(updatedStudent.getName());

            return studentRepo.save(student);
        }

        public Boolean deleteStudent(int id) {
            studentRepo.deleteById(id);
            return true;
        }
    }

