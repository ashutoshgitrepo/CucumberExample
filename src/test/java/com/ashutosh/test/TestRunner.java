package com.ashutosh.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:LoginFeature/LoginTest.feature",
					 glue="com.ashutosh.test",
					 plugin= {"pretty","html:target/test-report", 
							 "junit:target/cucumber.xml","json:target/cucumber.json"}
					
					)
public class TestRunner {

}
