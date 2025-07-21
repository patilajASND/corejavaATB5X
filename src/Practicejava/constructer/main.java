package Practicejava.constructer;

public class main {
  int x;
 public main(){
    x=5;

 }

    // To call a constructuer we need to call
    public static void main(String[] args) {
        main obj=new main();
        System.out.println(obj.x);
    }
}
