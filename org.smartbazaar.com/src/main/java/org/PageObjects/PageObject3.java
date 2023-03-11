package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject3 extends Browser {
    public PageObject3(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//div[@id='content']/nav")
    WebElement var3;

    public  WebElement savetext(){
        return var3;
    }

}
