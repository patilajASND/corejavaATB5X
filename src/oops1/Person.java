package oops1;

public class Person {
    String name;

    int height;

    String email;

    String colleagname;

    int id;


    Person(){
        name="omkar";
        email="patilmkar1025@gmail.com";
        System.out.println("Default Constructur");
    }

    Person(String name,int num ){
        this.colleagname=name;
        this.id=num;
        System.out.println("Paramertized Consrtuctur");
    }

     void printdata(){
        System.out.println(name);
        System.out.println(email);

    }
   public void printdata1(){
        System.out.println(colleagname);
        System.out.println(id);
    }
}
