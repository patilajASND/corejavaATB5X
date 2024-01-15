package inhertance;

import oops1.Programming;

public class programming {
    String name;

    int version;

    programming (){
        System.out.println("DC");
    }
    programming(String name, int version){
        this.name=name;
        this.version=version;
    }

    void print(){
        System.out.println(this.name + this.version);
    }
}
