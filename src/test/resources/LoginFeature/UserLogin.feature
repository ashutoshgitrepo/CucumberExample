#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: User Login
  User Should be able to login with valid credentials

  Background: 
    When when background step is executed


  Scenario Outline: Login with valid credential
    Given User is on login page
    When User enter username as "<uname>" and password as "<passwd>"
    And User submit the login page
    Then User should see the home page

    Examples: 
      | uname  | passwd  |
      | ashutk | p1234   |
      | jsmith | p12345  |
      | ashut3 | p123489 |
  

  Scenario: Login with invalid credential
    Given User is on login page
    When User enter username as "invalid" and password as "1234"
    And User submit the login page
    Then User should be in login page
    

