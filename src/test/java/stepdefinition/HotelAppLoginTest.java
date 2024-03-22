package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {
	
	
	WebDriver driver;
	@Before
	public void program() {
	
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	}
	@After
	public void p1() {
		driver.quit();
	}
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://adactinhotelapp.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	
	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("username_show")).getAttribute("value");
		//Assert.assertEquals("Hello vasuvespag!", greeting);
	}
	
	@When("I select location as {string}")
	public void i_select_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement location = driver.findElement(By.id("location"));
		Select value = new Select(location);
		value.selectByVisibleText("Sydney");
	}
	
	@When("Click on the search button")
	public void click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("Submit")).click();
	}

	@Then("I can see the hotel")
	public void i_can_see_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	

}
