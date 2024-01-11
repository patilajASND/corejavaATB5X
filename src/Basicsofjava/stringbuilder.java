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

        //insert char at index 0
        sb.insert(0,'s');
        System.out.println(sb);

        //insert at any index
        sb.insert(3,'a');
        System.out.println(sb);

        //delete index at any index
        sb.delete(2,3);
        System.out.println(sb);
    }
}
