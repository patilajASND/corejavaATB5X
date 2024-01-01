package Examples;

import java.util.Scanner;

public class lab001 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
          int n= sc.nextInt();
//        if (n%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("odd");
//        }
        int i;
        for(i=1; i<n; i++){
            if (i%2==0){
                System.out.println(i +"it is Even Number");
            }else{
                System.out.println(i + "it is odd Number");
            }

        }
    }
}
