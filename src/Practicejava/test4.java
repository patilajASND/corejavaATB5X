package Practicejava;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the factorial number ");
        int n=sc.nextInt();
        int fact=1;
        while(n>0){
          fact*=n;
          n--;
        }
        System.out.println(fact);
    }
}
