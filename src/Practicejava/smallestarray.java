package Practicejava;

public class smallestarray {
    public static void main(String[] args) {
        int num[]={99,66,5,33,77,34};
        int min=num[0];
        for (int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("smallest array is "+min);
    }


}
