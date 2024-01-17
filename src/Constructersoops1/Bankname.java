package Constructersoops1;

public class Bankname {

    String bankAccount;

    int balance;
    Bankname(){
        bankAccount= "Axis";
        balance= 241233;
        System.out.println();
    }
    Bankname(String name,int Num){
        this.balance=Num;
        this.bankAccount=name;
    }

    void printdetails(){
        System.out.println(bankAccount);
        System.out.println(balance);
    }
}
