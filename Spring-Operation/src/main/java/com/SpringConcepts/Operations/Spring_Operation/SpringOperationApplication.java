package com.SpringConcepts.Operations.Spring_Operation;

import com.SpringConcepts.Operations.Spring_Operation.Models.SendDetails;
import com.SpringConcepts.Operations.Spring_Operation.Models1.Student;
import com.SpringConcepts.Operations.Spring_Operation.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringConcepts.Operations.Spring_Operation.Models1.Student;
import com.SpringConcepts.Operations.Spring_Operation.Repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringOperationApplication {

		public static void main(String[] args) {
			ApplicationContext context = SpringApplication.run(SpringOperationApplication.class, args);


			StudentRepository studentRepository = context.getBean(StudentRepository.class);

			Student s = new Student();
			s.setName("Naresh");
			s.setLname("Petkar");
			s.setId("1");

			Student s1 = new Student();
			s.setName("Ram");
			s.setLname("Nanekr");
			s.setId("2");

			Student result=	studentRepository.save(s);
			System.out.println(result);

		}
	}

	/*@Autowired
	StudentRepository studentRepository;
	//@Autowired
	//SendDetails sendDetails;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringOperationApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student s=new Student();
		s.setName("Naresh");
		s.setLname("Petkar");
		s.setId(1);
	Student result	=StudentRepository.save(s);
		System.out.println(result);

SendDetails*/
		//SendDetails sendDetails;
		//SpringApplication.run(SpringOperationApplication.class, args);

