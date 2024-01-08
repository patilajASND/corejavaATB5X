package oops1;

public class Bankname {

    String bankAccount;

    int balance;
    Bankname(){
        bankAccount= "Axis";
        balance= 241233;
    }

    void printdetails(){
        System.out.println(bankAccount);
        System.out.println(balance);
    }
}
