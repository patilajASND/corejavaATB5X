package Practicejava.constructer;

public class parametermain {

    String name;

   public parametermain(String names){
      this.name=names;
   }

    public static void main(String[] args) {
        parametermain obj= new parametermain("omkar patil");
        System.out.println(obj.name);
    }
}
