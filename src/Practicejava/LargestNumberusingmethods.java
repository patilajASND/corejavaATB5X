package Practicejava;

import java.util.Scanner;

public class LargestNumberusingmethods {

    public static void  bignumber(int x, int y, int z){

        if(x>y && x>z){
           System.out.println("x is teh biggestnumber"+ x);
        } else if (y>x && y>z) {
            //return y;
            System.out.println("x is teh biggestnumber"+ y);

        }else {
            System.out.println("x is teh biggestnumber"+ z);
        }

    }

    public static void main(String[] args) {
        //int data=bignumber(80,88,43);

        //System.out.println(bignumber(80,88,43));

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();



        bignumber(x,y,z);
    }

}
