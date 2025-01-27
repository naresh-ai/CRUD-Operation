package com.SpringConcepts.Operations.Spring_Operation.Repository;

import com.SpringConcepts.Operations.Spring_Operation.Models1.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
}
