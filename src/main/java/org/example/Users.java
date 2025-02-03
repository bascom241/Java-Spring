package org.example;

public class Users {
    private String userName;
    private int accountNumber;


    public Users(){

    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setAccountNumber(Integer accountNumber){
        this.accountNumber = accountNumber;
    }
    public Integer getAccountNumber(){
        return accountNumber;
    }


//    @Override
//    public String toString() {
//        return "Users{" + "userName='" + userName + '\'' + ", accountNumber=" + accountNumber + '}';
//    }

//
//    public String toString(){
//        return "Users{" + "userName='" + userName + '\'' + ", accountNumber=" + accountNumber + '}';
//    }
}
