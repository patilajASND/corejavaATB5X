package Examples;

public class lab004 {
    public static void main(String[] args) {

        int n = 10;

        int j;
        //inner loop
        for (int i = 1; i <= n; i++) {
            //outer loop
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}