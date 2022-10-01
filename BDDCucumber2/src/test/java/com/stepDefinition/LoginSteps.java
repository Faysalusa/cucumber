package com.stepDefinition;

import org.openqa.selenium.WebDriver;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		 driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
		driver.manage().window().maximize(); 
	   
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	       
			driver.manage().window().maximize(); 
		   
	   
	}

	@When("I complete action")
	public void i_complete_action() {
	    
	   
	}

	@When("some other action")
	public void some_other_action() {
	    
	   
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	   
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	   
	}
}