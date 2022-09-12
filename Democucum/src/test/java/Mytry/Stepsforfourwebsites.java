package Mytry;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepsforfourwebsites {
	ChromeDriver driver;

	@Given("User is on the amazon  homepage of {string}")
	public void user_is_on_the_amazon_homepage_of(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		  ChromeDriver driver = new ChromeDriver();
	      driver.get("string");
	}

	@And("user enters keyword {string}")
	public void user_enters_keyword(String string) {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
	
	}

	@Then("user clicks {string}")
	public void user_clicks_(String string) {
		 driver.findElement(By.id ("nav-search-submit-button")).click();
	   
	}

	
	}


