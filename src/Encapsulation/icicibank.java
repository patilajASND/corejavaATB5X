package Encapsulation;

import java.sql.SQLOutput;

public class icicibank {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance >0){
            this.balance = balance;
        }else{
            System.out.println("not allowed");
        }

    }

    String name;


    long balance;


    public icicibank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    void print(){
        System.out.println(name  +  balance);
        System.out.println(getBalance());

    }

}
