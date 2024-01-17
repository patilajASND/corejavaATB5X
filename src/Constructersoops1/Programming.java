package Constructersoops1;

public class Programming {

    int version;
    String author;

    Programming() {
        System.out.println("DC");
    }
        Programming(String author,int version){
            this.author=author;
            this.version=version;
        }

        void print1(){
            System.out.println(this.author+ this.version);

        }
    }

