package Basicsofjava;

public class stringbuilder {
    public static void main(String []args){
         StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);

        //char  at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'o');
        System.out.println(sb);
    }
}
