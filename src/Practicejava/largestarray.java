package Practicejava;

public class largestarray {
    public static void main(String[] args) {
        int [] arr={12,55,66,54,2,33,44};
        int max=arr[0];

        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest  number "+ max);
    }


}
