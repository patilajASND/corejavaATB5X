package singleinhertance;

public class java  extends programming{
String newFeature;


    java(){
    System.out.println("DC");
}
    java (String newFeature){
        this.newFeature=newFeature;
    }

    void Printinfo(){
        System.out.println(this.newFeature);
    }
}
