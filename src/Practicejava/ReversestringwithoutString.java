package Practicejava;

public class ReversestringwithoutString {

    public static void main(String[] args) {

       String orignal="automation";
        String reverse=" ";

        for (int i=orignal.length()-1;i>=0;i--){
            reverse+=orignal.charAt(i);

        }
    System.out.println(reverse);
    }
}
