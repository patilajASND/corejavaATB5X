package Practicejava;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
        sum+=n;
        n--;
        }
        System.out.println(sum);
    }
}
