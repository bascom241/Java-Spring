package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerManagement {
    private UserManagement manage;
    private List<String> transactions = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    public CustomerManagement(UserManagement manage) {
        System.out.println("Customer Constructor Craeted ");
        this.manage = manage;
    }

    public Map<String, Integer> getManage(){
        return manage.getUserdetails();
    }


    public void validateDetails(){
        System.out.println("Please Enter TransactionType");
        String userSelectedTransactionType = "";
        while(userSelectedTransactionType.isEmpty()){
            System.out.println("Please Enter a transaction Type");
            userSelectedTransactionType = scan.nextLine();
            if(userSelectedTransactionType.isEmpty()){
                System.out.println("You Have Pressed Enter without Transaction Type");
            }
        }
        System.out.println("You Entered " + userSelectedTransactionType);
        scan.close();

    }

}