package Examples;

public class lab003 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        int j;
        //inner loop
        for (int i=1; i<=n;i++){
            //outer loop
            for(j=1;j<=5;j++){
               if (i==1||j==1||i==n ||j==m){
                   System.out.print( "*");
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }

    }
}