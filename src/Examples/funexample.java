package Examples;

import java.util.Scanner;

public class funexample {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int Product=calculateProduct(a,b);

        System.out.println(Product);

    }
    public static int calculateProduct(int a, int b){
        return a*b;
    }

}
