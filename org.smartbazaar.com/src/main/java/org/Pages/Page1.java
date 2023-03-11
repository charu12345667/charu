package org.Pages;

import org.Browser.Browser;
import org.PageObjects.PageObject1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Page1 extends Browser {
    static PageObject1 obj1;

    public static void searchdata(String data){
        obj1=new PageObject1();

        obj1.searchdata().sendKeys(data);
    }
     public static void clickenter(){

        obj1.clickenter().submit();
       }
       public static String gettitle(){
        return driver.getTitle();
       }
}
