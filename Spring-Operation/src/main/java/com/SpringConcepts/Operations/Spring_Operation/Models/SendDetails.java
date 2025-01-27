package com.SpringConcepts.Operations.Spring_Operation.Models;


import org.springframework.stereotype.Component;

@Component
public class SendDetails implements EmpMainOffice {

    public void call(){
        System.out.println("secondary class ");
    }
        private String name;
        private String position;
        private int id;


        public SendDetails() {
            this.name = "Nana";
            this.position = "Software Engineer";
            this.id = 101;
        }

        public String getName() {
            return name;
        }

    public int getId() {
            return id;
        }
    }