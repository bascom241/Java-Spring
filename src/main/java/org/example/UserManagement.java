package org.example;


import java.util.HashMap;
import java.util.Map;

public class UserManagement {
private Users users;
private final Map<String,Integer> customerDetails;

public UserManagement(){
    this.customerDetails = new HashMap<>();
}
public UserManagement(Users users){
    System.out.println("User Management Constructor Created");
    this.users = users;
    this.customerDetails = new HashMap<>();
}

public Map<String, Integer> getCustomerDetails (){
    customerDetails.put("abdullahi", 5000);
    customerDetails.put("AbdulKabir", 6000);
    return customerDetails;
}


public void setUsers(Users users){
    this.users = users;
}
public Users getUsers(){
    return users;
}

}
