package com.practice;

public class JavaTry {

    public static void main(String[] args){
        AccountTT accountTT1 = new AccountTT("AJ001","Mr Spoke",0);
        AccountTT accountTT2 = new AccountTT();
        AccountTT accountTT3 = new AccountTT();

        System.out.println("account name:" +accountTT1.getAccountName());
        System.out.println("balance after create:" +accountTT1.getBalance());
        accountTT1.deposit(50);
        System.out.println("balance after deposit:" +accountTT1.getBalance());
        accountTT1.withdraw(10);
        System.out.println("balance after withdraw:" +accountTT1.getBalance());
    }
}
