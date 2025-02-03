package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to Our Official Banking System");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserManagement userManagement = (UserManagement) context.getBean("userManagement");
        Map<String,Integer> results = userManagement.getCustomerDetails();
        results.forEach((key,value)-> System.out.print(key+ ": " +  value));



    }
}
