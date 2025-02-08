package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to Our Official Banking System");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        UserManagement userManagement = context.getBean("usermanagement",UserManagement.class);
//        System.out.println(userManagement.getUserdetails());

        CustomerManagement customerManagement = context.getBean("customer", CustomerManagement.class);
        System.out.println(customerManagement.getManage());
        customerManagement.validateDetails();
    }
}
