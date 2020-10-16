@SmokeTest
Feature: Data table Verify that the new user registration is unsuccessful after passing incorrect inputs.

  Scenario: list of list
    Given I am on the new user registration page
    When I enter invalid data on the page
      | Fields                 | Values              |
      | First Name             | Tom                 |
      | Last Name              | Kenny               |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              |                  01 |
    Then the user registration should be unsuccessful

  Scenario: list of Map
    Given I am on the library website
    Given I have the following books in the store by map
      | title                                | author      |
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
    When I search for books by author Erik Larson
    Then I find the books
