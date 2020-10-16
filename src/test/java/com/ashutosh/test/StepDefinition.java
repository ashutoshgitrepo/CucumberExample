package com.ashutosh.test;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on login page");
	    //throw new PendingException();
	}


	@When("^User enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {// Write code here that turns the phrase above into concrete actions
		System.out.println("Username is on login page"+arg1);
		System.out.println("User passoed is on login page"+arg2);
		
	    //throw new PendingException();
	}

	@When("^User submit the login page$")
	public void user_submit_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User submit the login page");
	}

	@Then("^User should see the home page$")
	public void user_should_see_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User should see the home page");
	}
	
	@Then("^User should be in login page$")
	public void user_should_be_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User should be in login page");
	}
	
	
	@When("^when background step is executed$")
	public void when_background_step_is_executed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when background step is executed...");
	}
	@Given("^I want to verify that (\\d+) plus (\\d+) equals (\\d+)$")
	public void i_want_to_verify_that_plus_equals(int arg1, int arg2, int arg3) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("arg1="+ arg1);
		System.out.println("arg2="+ arg2);
		System.out.println("arg3="+ arg3);
		//Assert.assertEquals("", arg1, 1, 0);
	}
	
	
}