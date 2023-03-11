package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject1 extends Browser {
    public PageObject1(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "s")
    WebElement var;

    public  WebElement searchdata(){
        return var;
    }
    @FindBy(className= "aws-search-btn_icon")
    WebElement click;
    public  WebElement clickenter(){
        return click;
    }

}
