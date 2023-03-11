package org.Pages;

import org.Browser.Browser;
import org.PageObjects.PageObect2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class Page2 extends Browser {
    static PageObect2 obj2;
    public static void selectdata(String product) throws InterruptedException {
        Thread.sleep(3000);
       List <WebElement> Data = obj2.selectdata().findElements(By.xpath(".//li/div/div/div[3]/div[1]/h4/a"));
       Actions act= new Actions(driver);
        for(int i=0;i<Data.size();i++){
            String searchdata = Data.get(i).getText();
            if(searchdata.equalsIgnoreCase(product)){
                act.moveToElement(Data.get(i)).click().build().perform();
               break;
            }
            //System.out.println(searchdata);
        }
    }
    public static String savetext(){
        obj2 = new PageObect2();
       return obj2.savetext().getText();
    }
}
