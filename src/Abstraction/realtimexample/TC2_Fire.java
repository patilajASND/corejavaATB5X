package Abstraction.realtimexample;

import java.sql.SQLOutput;

public class TC2_Fire extends Baseclass{
    @Override
    String openBrowser() {
        System.out.println("opening Fire Fox");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Fire fox");
        return null;
    }
}
