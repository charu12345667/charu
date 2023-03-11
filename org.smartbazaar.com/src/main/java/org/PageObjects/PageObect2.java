package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObect2 extends Browser {
    public PageObect2(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//div[@id='content']/nav")
    WebElement var1;

    public  WebElement savetext(){
        return var1;
    }
    @FindBy(xpath ="//*[@class='products columns-5']")
    WebElement var2;
    public  WebElement selectdata(){
        return var2;
    }
}
