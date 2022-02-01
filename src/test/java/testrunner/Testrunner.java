package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jigur\\eclipse\\Cucumber\\src\\test\\java\\feature\\Rememberme.feature", glue = {"stepdef"},
plugin = {"pretty","json:target/HTmlreports.json"}, monochrome = true,
dryRun = true, tags="@regression and not @smoke")
public class Testrunner {

}
