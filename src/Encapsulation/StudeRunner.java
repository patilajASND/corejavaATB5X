package Encapsulation;

public class StudeRunner {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="omkar";
        s.name="patil";

        persons p= new persons();
        p.id=1;
        p.name1="omkar";
        //any one can change the varible
        p.print();
    }
}
