package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {

	WebDriver driver;
	@Given("User must be on homepage by clicking url {string}")
	
	public void user_must_be_on_homepage_by_clicking_url(String string) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(string);
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
	   driver.findElement(By.id("username")).sendKeys(username);
	   Thread.sleep(5000);
	   driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click in signin button")
	public void click_in_signin_button() {
	   driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() {
	    String actualresult = driver.getCurrentUrl();
	    Assert.assertEquals("https://demo.applitools.com/app.html", actualresult);
	}
	
	
}
