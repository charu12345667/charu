package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Pages.Page1;
import org.Pages.Page2;
import org.Pages.Page3;
import org.Screenshot.Screenshot1;
import org.testng.Assert;

public class TestCase1 {
    @And("User enters the {string} data")
    public void user_enters_the_data(String string) {
        Page1.searchdata(string);
    }
    @Then("user click on the search icon")
    public void user_click_on_the_search_icon() {
        Page1.clickenter();
    }
    @Then("user verifies the {string} results")
    public void user_verifies_the_results(String string) {
       try{
           Screenshot1.TakeScreenshot(string);
           Assert.assertEquals(Page2.savetext(),string);
                  }catch(AssertionError e){System.out.println(e);

        }
    }
    @When("user selects the {string} product")
    public void user_selects_the_product(String string) throws InterruptedException {
        Page2.selectdata(string);
    }
    @And("user verifies the {string} product results")
    public void user_verifies_the_product_results(String string) {
        try{
            Assert.assertEquals(Page3.savetext(),string);
        }catch(AssertionError e){System.out.println(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
