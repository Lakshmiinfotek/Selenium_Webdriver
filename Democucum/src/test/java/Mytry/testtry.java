package Mytry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testtry {

	
		@Given("User is on login page")
		public void verifyinglogin() {
			
			System.out.println("user is on login page");
		    
		    
		}

		@When("User enters username and password")
		public void user_enters_username_and_password() {
		    System.out.println("user enters username and password");
		    
		}

		@When("click on login button")
		public void click_on_login_button() {
		    System.out.println("User is click on login button");
		}

		@Then("User is navigated to the homepage")
		public void user_is_navigated_to_the_homepage() {
			 System.out.println("user is navigated to the homepage");  
		}




	

	
	}

