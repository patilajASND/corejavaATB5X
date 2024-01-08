package oops1;

public class atbperson {
     String name;

     String email;

     boolean ismaried;

     long phone;


     atbperson(){
         name="omkar";
     }
     atbperson(String valueformobject){
          this.email= valueformobject;
     }
     public void printdeatils() {
          System.out.println(this.name);
          System.out.println(this.email);
     }
}
