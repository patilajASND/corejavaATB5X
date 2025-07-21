package Practicejava;

public class largest_array {

    public static void main(String[] args) {
        int[]number={44,7,8,90,65};
        int max=number[0];

        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
        }

        System.out.println("this is the maximum number "+max);


    }
}
