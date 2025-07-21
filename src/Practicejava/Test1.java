package Practicejava;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
//        int arr[]= new int[]{sc.nextInt(6)};
        int arr[]={44,55,66,77,22,3,56,98};
        int l= arr.length;
        System.out.println("checking the odd ARRAY out put");
        for(int i=0;i<l;i++){
            if(arr[i] % 2 != 0){
                System.out.println( arr[i]+"it is a odd number");
            }
        }

        System.out.println("Checking the even array output");
        for (int j=0;j<l;j++){
           if(arr[j]%2==0){
                System.out.println(arr[j]+"it is even number");
           }
        }

    }
}
