package Examples;

import java.util.Scanner;

public class functionexam2 {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your A And B ");
        int a=sc.nextInt();
        int b=sc.nextInt();
       // int sum = sum(a, b); either u create a seperate variable or the function should be printed out
        System.out.println(sum(a,b));
    }

    public static int sum(int a,int b){
     return a+b;
    }
}
