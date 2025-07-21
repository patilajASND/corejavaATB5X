package Practicejava;

public class stringpalindrom {

    public static void main(String []args ){

        String data="madam";
        boolean ispalindrom=true;
        for (int i=0;i<data.length()/2;i++) {
            if (data.charAt(i) != data.charAt(data.length() - i - 1)) {


                ispalindrom = false;
                break;
            }
        }

        System.out.println(data +"  "+ ispalindrom);
    }



}
