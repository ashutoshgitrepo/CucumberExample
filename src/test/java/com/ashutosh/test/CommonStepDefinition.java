package com.ashutosh.test;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefinition {

	@Given("^I am on the new user registration page$")
	public void goToFacebook() {
		// Intiate web browser instance. driver = new FirefoxDriver();
		// driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I enter invalid data on the page$")
	public void enterData(DataTable table) {
		// Initialize data table
		List<List<String>> dataList = table.raw();
		// System.out.println("=============="+data.get(1).get(1));
		for (List list : dataList) {
			System.out.println(list.get(0) + "==============" + list.get(1));
		}
	}

	@Then("^the user registration should be unsuccessful$")
	public void User_registration_should_be_unsuccessful() {
		// if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")){
		System.out.println("registration failed");

	}

	@Given("^I am on the library website$")
	public void i_am_on_the_library_website() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on the library website");
	}

	@Given("^I have the following books in the store by map$")
	public void i_have_the_following_books_in_the_store_by_map(DataTable table) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc).
		// Field names for YourType must match the column names in
		// your feature file (except for spaces and capitalization).
		
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	    
	    for (Map<String, String> columns : rows) {
	    	System.out.println("======Title====="+columns.get("title"));
	    	System.out.println("====Author===="+columns.get("author"));
	    }
		
	}

	@When("^I search for books by author Erik Larson$")
	public void i_search_for_books_by_author_Erik_Larson() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("search for books by author Erik Larson");
	}

	@Then("^I find the books$")
	public void i_find_the_books() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Found the book");
	}
	@Given("^I want to verify that (\\d+)\\.(\\d+) plus (\\d+)\\.(\\d+) equals (\\d+)\\.(\\d+)$")
	public void i_want_to_verify_that_plus_equals(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("arg1="+ arg1);
		System.out.println("arg2="+ arg2);
		System.out.println("arg3="+ arg3);
		System.out.println("arg4="+ arg4);
		System.out.println("arg5="+ arg5);
		System.out.println("arg6="+ arg6);
		
	    
	}
	
	@Given("^I want to verify with decimal that (\\d+\\.\\d+) plus (\\d+\\.\\d+) equals (\\d+\\.\\d+)$")
	public void i_want_to_verify_that_plus_equals(float arg1, float arg2, float arg3) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("arg1="+ arg1);
		System.out.println("arg2="+ arg2);
		System.out.println("arg3="+ arg3);
	    
	}
	
	@When("^I open application in (.*) browser$")
	public void i_open_application_in_Chrome_browser(String browser) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("browser="+ browser);
	}


	

}
