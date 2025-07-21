package Practicejava;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class reversestringusingstringbuilder {

    public static void main(String[] args) {


        String original = "automation";

        String reverse = new StringBuilder(original).reverse().toString();
        System.out.println(reverse+ " is reverse String ");
    }
}
