package org.example;

public class Users{
    private String userName;
    private int accountNumber;
    private String userName2;
    private int accountNumber2;

    public Users(){
        System.out.println("Users Class Iniated");
    }

    public void setAccountNumber(int  accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }


    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public int getAccountNumber2() {
        return accountNumber2;
    }

    public void setAccountNumber2(int accountNumber2) {
        this.accountNumber2 = accountNumber2;
    }

    public String getUserName2() {
        return userName2;
    }

    public void setUserName2(String userName2) {
        this.userName2 = userName2;
    }
}
