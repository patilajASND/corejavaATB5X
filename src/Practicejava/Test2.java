package Practicejava;

import java.util.Scanner;
// wajp to print 1 to n
public class Test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int j=0;
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//        }

        while(j<=n){
            System.out.println(j);
            j++;
        }
    }
}
