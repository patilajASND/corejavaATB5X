package Practicejava;

import java.util.Arrays;

public class Anagramstring {

    static boolean stringanagram(String s1,String s2){

        if (s1.length() !=s2.length()){
            return false;
        }
        // concert String in to chararray
         char []chararray1=s1.toCharArray();
        char []chararray2=s2.toCharArray();

        Arrays.sort(chararray1);
        Arrays.sort(chararray2);

        return  Arrays.equals(chararray1,chararray2);
    }

    public static void main(String[] args) {
        String s1="geeks";
        String s2="kseeg";

        if(stringanagram(s1,s2)== true){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}