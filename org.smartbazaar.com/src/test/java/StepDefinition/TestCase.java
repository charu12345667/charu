package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Browser.Browser;
import org.Pages.Page1;
import org.Screenshot.Screenshot1;
import org.testng.Assert;
import org.testng.Reporter;

public class TestCase {
    @Given("User open the browser")
    public void user_open_the_browser() {

      Browser.openbrowser();
    }
    @Then("User enter the URL {string}")
    public void user_enter_the_url(String string) throws InterruptedException {
       Browser.openUrl(string); //url is saved in string variable
    }
    @And("User verifies the title of the application")
    public void user_verifies_the_title_of_the_application() {
        Screenshot1.TakeScreenshot("Test1");
        Assert.assertEquals(Page1.driver.getCurrentUrl(), "https://smartbazaar.co.uk/");}

    @Then("User close the Browser")
    public void user_close_the_browser() {
       Browser.closebrowser();
    }
}
