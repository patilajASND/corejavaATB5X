package Examples;

import java.util.Scanner;

public class functionexam3 {

    public static void main(String[]args){
        Scanner p =new Scanner(System.in);
        int n= p.nextInt();
        System.out.println(printEvenNumber(n));
    }
    public static boolean printEvenNumber(int n){
        if(n%2==0){
            System.out.println("it is even number");
        }else {
            System.out.println("it is odd Number");
        }
        return false;
    }
}
