package Mytry;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginsteps {
	ChromeDriver driver;

	@Given("I am on the demo website {string}")
	public void i_am_on_the_demo_website(String string) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		  ChromeDriver driver = new ChromeDriver();
	
		driver.get("string");
	   
	}

	@When("I type login = {string} and password = {string}")
	public void i_type_login_and_password(String string, String string2) {
		WebElement username = driver.findElement(By.name("Email"));
		WebElement password = driver.findElement(By.name("Password"));
				
		username.clear();
		username.sendKeys(string);
		password.clear();
		password.sendKeys(string2); 
		}
	
	    
	

	@And("I click sign-in button")
	public void i_click_sign_in_button() {
		WebElement SubmitButton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		SubmitButton.click();
	}

	@Then("I should get {string} text")
	public void i_should_get_text(String string) {
		String actualValue=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
	Assert.assertEquals(actualValue,string);
	}




}
