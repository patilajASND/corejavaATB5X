package Practicejava;

import java.util.Scanner;

public class reversepalindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int rev=0;
      int pal=n;
      do {
          int d=n%10;
          rev=rev*10+d;
          n/=10;
      }while(n!=0);
       System.out.println(rev);
        if (rev==pal){
            System.out.println("it is a palindrom");
        }

    }

}
