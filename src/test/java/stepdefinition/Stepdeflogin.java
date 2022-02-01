package stepdefinition;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdeflogin {
	WebDriver driver;
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	}

	@When("User clicks on Login page")
	public void user_clicks_on_login_page() {
	    driver.findElement(By.id("login2")).click();
	}

	@When("Enter login username")
	public void enter_login_username() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.id("loginusername")).sendKeys("jigar12345");
	}

	@When("Enter login Password")
	public void enter_login_password() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.id("loginpassword")).sendKeys("12345");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	   driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	}

	@Then("User must be on welcome page")
	public void user_must_be_on_welcome_page() throws InterruptedException {
		Thread.sleep(5000);
	    boolean a = driver.findElement(By.linkText("Welcome jigar12345")).isDisplayed();
	    Assert.assertEquals(a, true);
	    System.out.println(a);
	}
	@Then("Click on laptop option")
	public void click_on_laptop_option() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
	}

	@Then("Select laptop")
	public void select_laptop() throws InterruptedException {
	    driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
	    Thread.sleep(5000);
		boolean a = driver.findElement(By.linkText("Add to cart")).isDisplayed();
		Assert.assertEquals(a, true);
		System.out.println(a);
	}

	@Then("Click on addtocart")
	public void click_on_addtocart() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("Click on cart and verify cart is filled with laptop")
	public void click_on_cart_and_verify_cart_is_filled_with_laptop() {
		driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
		boolean b = driver.findElement(By.cssSelector("#page-wrapper > div > div.col-lg-1 > div")).isDisplayed();
		Assert.assertEquals(b, true);
		System.out.println(b);
		driver.close();
	}
}
