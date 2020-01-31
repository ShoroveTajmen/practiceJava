package com.practice;

public class JavaTest {

    public static void main(String[] args) {
        Account account1 = new Account("AJ0001","Mr Spock",0);
        Account account2 = new Account();
        account2.setAccountNumber("Aj0002");
        account2.setAccountName("Mr Rudie");
        account2.setBalance(5);

        System.out.println("Acount info: "+ account2.getAccountNumber());
        System.out.println("Acount info: "+ account2.getAccountName());



       System.out.println("acount name:" +account1.getAccountName());
       System.out.println("balance after create:" + account1.getBalance());
       account1.deposit(50);
       System.out.println("balance after deposit:" + account1.getBalance());
        account1.withdraw(100);
        System.out.println("balance after withdraw:" + account1.getBalance());
    }
}
