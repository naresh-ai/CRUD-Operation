package com.CRUD.operation.Spring_CRUD_Operation.Repo;

import com.CRUD.operation.Spring_CRUD_Operation.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
