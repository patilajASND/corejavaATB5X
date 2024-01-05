package Examples;

import java.util.Scanner;

public class funexample1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Numbers");
        int n=sc.nextInt();
        calculateFactorial(n);

    }
    public static void calculateFactorial(int n){
        int factorial= 1;
        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
