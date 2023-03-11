package org.example;

import org.Browser.Browser;
import org.Pages.Page1;
import org.Pages.Page2;
import org.Pages.Page3;

public class sample {
    public static void main(String[] args) throws InterruptedException {
        Browser.openbrowser();
        Browser.openUrl("https://www.smartbazaar.co.uk/");

        Page1.searchdata("flowers");
        Page1.clickenter();
        System.out.println( Page2.savetext());
        Page2.selectdata("CAULIFLOWER");

        System.out.println(Page3.savetext());
        Browser.closebrowser();
    }
}
