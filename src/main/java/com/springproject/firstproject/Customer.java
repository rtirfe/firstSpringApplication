package com.springproject.firstproject;

public class Customer {
    private String FName;
    private String LName;
    private int accNumber;
    private String username;
    private long balance;

    public Customer(String FName, String LName, String username, String password) {
        this.FName = FName;
        this.LName = LName;
        this.username = username;
        this.password = password;
        this.balance = 0;
        accNumber = setAccNumber();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int setAccNumber() {
        int number = (int )(Math.random() * 50 + 1);
        return accNumber;
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
