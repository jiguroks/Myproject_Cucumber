package stepdefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefsignup {
 WebDriver driver;
	@Given("User must be on home page by clicking on url {string}")
	public void user_must_be_on_home_page_by_clicking_on_url(String string) {
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
	   driver.findElement(By.id("signin2")).click();
	}

	@When("Enter username")
	public void enter_username() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.id("sign-username")).sendKeys("jigar12345");
	}

	@When("Enter password")
	public void enter_password() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("sign-password")).sendKeys("12345");
	}

	@When("Click on Signup button")
	public void click_on_signup_button() {
	    driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	}

	@Then("Click on alert")
	public void click_on_alert() throws InterruptedException {
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();	    
	    String a = alert.getText();
	    if (a=="This user already exist.") {
	    	alert.dismiss();
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[1]")).click(); 	
	    }
	    else { 
	    
		alert.accept();
	    }
	    driver.close();
	}
}
