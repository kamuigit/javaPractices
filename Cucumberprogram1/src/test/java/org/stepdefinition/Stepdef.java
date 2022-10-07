package org.stepdefinition;



import java.util.Map;

import org.openqa.selenium.By;
import org.pojo.Pojoclass;
import org.utilities.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Baseclass {
	public Pojoclass l;

	@Given("User have to enter into login page")
	public void user_haave_to_enter_into_login_page() {
	
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
		applyWaitForAllLocators();
	}

	@When("user have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String pass) {
		l = new Pojoclass();
		fill(l.getTxtuser(), email);
		fill(l.getTxtpass(), pass);
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		l = new Pojoclass();
		btnClick(l.getBtnlogin());

	}

	@Then("User should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {
		String url = pageUrl();
		if (url.contains("privacy_mutation_")) {
			System.out.println("user reached invalid page");
		} else {
			System.out.println("user entered valid credentials");
		}
		
	}
	@When("user have to enter valid email and valid password")
	public void user_have_to_enter_valid_email_and_valid_password() {
		l = new Pojoclass();
		fill(l.getTxtuser(), "email@12");
		fill(l.getTxtpass()," pass");
	}
	@When("user have to enter email and password")
	public void user_have_to_enter_email_and_password(io.cucumber.datatable.DataTable d) {
	    Map<String, String> mp = d.asMap(String.class, String.class);
	    String user = mp.get("username");
	    String pass = mp.get("password");
	    
	    driver.findElement(By.id("email")).sendKeys(user);
	    driver.findElement(By.id("pass")).sendKeys(pass);
	    
	}
}
