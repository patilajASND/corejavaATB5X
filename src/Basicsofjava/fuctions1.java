package Basicsofjava;

import java.util.Scanner;

public class fuctions1 {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calculateSum(a,b);
        System.out.println(sum);

    }
public static int calculateSum (int a, int b){
        int sum = a+b;
    return sum;
}
}
