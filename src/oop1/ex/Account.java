package oop1.ex;

public class Account {

    int balance=0;

    //입금
    void deposit(int amount){
        balance+=amount;
        System.out.println("현재 잔액은: "+balance);
    }

    boolean withdraw(int amount){
        if (balance<amount){
            System.out.println("잔액이 부족합니다");
            return false;
        }else if(balance>=amount){
            balance-=amount;
            System.out.println("현재 잔액은: "+balance);
        }
        return true;
    }
}
