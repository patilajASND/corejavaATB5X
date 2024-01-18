package poly.overriding;

public class RC {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();
        Honund h=new Honund();
        h.bark();
      Dog f=new Honund();
      //this  is run time polymorphisam      f.bark();
      f.bark();

    }

}
