package Abstraction.realtimexample;

public class TC1_Crome extends Baseclass {

    @Override
    String openBrowser() {
        System.out.println("Staring Crome");

        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Crome");
        return null;
    }
}
