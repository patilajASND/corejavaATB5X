package Practicejava;

public class singleStringoccurence {
    public static void main(String[] args) {
        String s="automation java selenium";

        int beforecount = s.length();
        int replacedchar = s.replace("a", "").length();

        int count =beforecount-replacedchar;

        System.out.println(" "+count);
    }
}
