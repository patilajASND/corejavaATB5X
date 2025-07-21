package Practicejava;

public class Evenoddarray {
    public static void main(String[] args) {

        int a[]={3,5,7,8,9,10,66,99};

        //int l=a.length;

        for (int i=0;i<a.length;i++){
            if (a[i]%2 !=0){
                System.out.println(a[i]+ " is an odd number");
            }
        }
        for (int i=0;i<a.length;i++){
            if (a[i]%2 ==0){
               System.out.println(a[i]+" is an even number");
            }
        }
    }


}
