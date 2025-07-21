package Encapsulation;



public class icicibank {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance >0){
            this.balance = balance;
        }else{
            System.out.println("not allowed");
        }

    }

    private String name;


      private long  balance;


    public  void icici(String name, long balance) {
        System.out.println(this.name = name);
        System.out.println(this.balance = balance);
    }



//    public void print(){
//        System.out.println(name  +  balance);
//        System.out.println(getBalance());
//
//    }

}
