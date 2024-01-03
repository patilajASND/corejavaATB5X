package Examples;

public class lab005 {
    public static void main(String[] args) {

        int n = 5;

        int j;
        //outer loop
        for (int i = n; i >=1; i--) {
            //inner loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
