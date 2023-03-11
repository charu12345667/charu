package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//resources//Feature",glue = {"StepDefinition"})
public class TestRunner {


}*/


@CucumberOptions(features ="src//test//resources//Feature//TestCase.feature",glue = {"StepDefinition"},monochrome = false,
plugin = {"pretty","html:target/cucumberreport/TestCase.html"})
public class TestRunner  extends AbstractTestNGCucumberTests {


}
