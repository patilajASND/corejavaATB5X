package Examples;

public class lsb006 {
    public static void main(String[] args) {

        int n = 5;

        int j;
        //inner loop
        for (int i = 1; i <= n; i++) {
            //outer loop for spaces
            for (j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}