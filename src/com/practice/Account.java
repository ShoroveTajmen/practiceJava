package com.practice;

public class Account {
    private String accountNumber;
    private String accountName;
    private int balance;

    public Account(){}
    //constructor
    public Account(String accountNumber, String accountName, int balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }
    // withdraw function change
    public void withdraw(int amount){
        if(this.balance > amount)
        {
            this.balance -= amount;
        }
    }
}
