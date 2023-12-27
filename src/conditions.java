 import java.sql.SQLOutput;
 import java.util.*;
public class conditions {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String Name =sc.nextLine();
        System.out.println("Enter Your age");
        int age=sc.nextInt();

        if (age==18){
            System.out.println("your are Adult");
        }else{
            System.out.println("Your are not Adult ");
        }
    }

}
