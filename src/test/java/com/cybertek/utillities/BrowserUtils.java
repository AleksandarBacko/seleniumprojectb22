package com.cybertek.utillities;

public class BrowserUtils {

    public static void sleep(int secund) {
        secund*=1000;
        try {
            Thread.sleep(secund);
        } catch (InterruptedException e) {          //nasloni na sleep i izaberi more options i try/catch -isto radi kao i import nasloni opcija
            e.printStackTrace();
        }

    }
}
