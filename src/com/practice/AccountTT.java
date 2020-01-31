package com.practice;

public class AccountTT {
    private String accountNumber;
    private String accountName;
    private int balance;

    public AccountTT(){} // new AccountTT()
    // new AccountTT("aaaa", "aaa",44)
    public AccountTT(String accountNumber,String accountName,int balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    // new AccountTT("aaaa")
    public AccountTT(String accountNumber){
        this.accountNumber = accountNumber;
    }
    // new AccountTT("aa", "aaa")
    public AccountTT(String accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
    // new AccountTT("aaa",12)
    public AccountTT(String accountName, int balance){
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNumber(){return accountNumber;}
    public String getAccountName(){return accountName;}
    public int getBalance(){return balance;}

    public void deposit(int amount){this.balance += amount;}
    public void withdraw(int amount){this.balance -= amount;}


}
