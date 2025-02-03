package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {
    List transactions;
    Scanner scan = new Scanner(System.in);
    private String accountName;
    private Integer accountNumber;

    private UserManagement usermanage;
    public CustomerManagement(List transactions){


        System.out.println("Customer Management Class created");
    }



    public UserManagement getUsermanage() {
        return usermanage;
    }

    public void setUsermanage(UserManagement usermanage) {
        this.usermanage = usermanage;
    }


    // Define List of Activities I can do as a User //


private String transactioType;
    public CustomerManagement(){
        this.transactions = new ArrayList<>();
        transactions.add("balance");
        transactions.add("credit");
        transactions.add("debit");
        try{

            for (Object transaction: transactions){
                System.out.println(transaction);
            }
            System.out.println("Please Enter From any Transaction Type Above :");
            while(true) {

                if(scan.hasNext()){
                    transactioType = scan.nextLine().trim();

                    if(transactions.contains(transactioType) && transactioType.matches("[a-zA-Z]+")){
                        System.out.println("You Choose to Perform " + ":" +  transactioType );
                        break;
                    } else System.out.println("Transcation type does not exit");
                } else System.out.println("Please add a trnsaction type ");

                  }

//
//            switch(transactioType){
//                case 1 -> {
//                    System.out.print("Good");
//                }
//
//            }


            switch (transactioType) {
                case "balance" -> {
                    System.out.println("Getting Balance...");
                    System.out.println("Please Enter Your User Name");
                    accountName = scan.nextLine().trim();

                }
            }

        }catch(Exception e){
            System.out.println("Unexpected Error ocuured" + e );
        }

    }







}
