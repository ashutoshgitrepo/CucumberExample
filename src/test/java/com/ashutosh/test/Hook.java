package com.ashutosh.test;



import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before
	public void init() {
		//System.out.println("Before hook===");
	}
	
	@After
	public void cleanup() {
		//System.out.println("After hook===");
	}
}
