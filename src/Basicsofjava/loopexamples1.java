package Basicsofjava;

import java.util.Scanner;

public class loopexamples1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your N ");
        int n = sc.nextInt();
        for (int i = 0; i <11; i++) {
            System.out.println(n * i);
        }
    }
}