package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserManagement{
    private Map<String,Integer> userdetails;
    private Users users;

    public UserManagement (Users users){
        System.out.println("UserMangement Class Initiated");
        this.userdetails = new HashMap<>();
        this.users = users;
    }

    public Map<String, Integer> getUserdetails(){
        userdetails.put(users.getUserName(), users.getAccountNumber());
        userdetails.put(users.getUserName2(), users.getAccountNumber2());
        return userdetails;
    }


}