package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jigur\\eclipse\\Cucumber\\src\\test\\java\\feaure", glue= {"stepdefinition"},
plugin= {"pretty","json:target/HTmlreports.json"}, monochrome=true)
public class Testrunnersignlogin {

}
