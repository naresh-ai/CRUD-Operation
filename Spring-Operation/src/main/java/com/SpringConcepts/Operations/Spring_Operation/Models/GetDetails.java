package com.SpringConcepts.Operations.Spring_Operation.Models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GetDetails implements EmpMainOffice{
    public void call(){
        System.out.println("call Primary class");
    }
}
