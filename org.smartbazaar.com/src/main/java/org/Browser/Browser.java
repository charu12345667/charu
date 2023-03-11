package org.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class Browser {
    public static WebDriver driver;
    public static Actions act;
    public static String fileProperties(String propertiesData)  //browser
    {
        String returnData = null;
        try {
            String filelocation = System.getProperty("user.dir") + "//src//main//resources//Configuration//configure.properties";
            File file = new File(filelocation);
            FileInputStream fileinput = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fileinput);
            returnData = prop.getProperty(propertiesData); //browser
        }catch(Exception e)
        {
            System.out.println("Properties" + e);
        }
        return returnData;
    }
    public static void openbrowser(){
        String choice = Browser.fileProperties("Browser");
        if (choice.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        } else if (choice.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver =new EdgeDriver();

        }

            }
    public static void openUrl(String URL) throws InterruptedException {
        driver.get(URL);
       // WebElement Accept=  driver.findElement(By.xpath("//*[@id='cookie_action_close_header']"));
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Accept")).click();
        //WebElement Accept = driver.findElement(By.)
       // act.moveToElement(Accept).click().build().perform();
    }

    public static void closebrowser(){
        driver.quit();
    }
}
