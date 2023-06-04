@Regression
Feature: Sign in Feature

  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name       | email             | password     | confirmPassword |
      | Abadullah | abadjan89@gmail.com | Jan@123456 | Jan@123456    |
    And User click on SignUp button
    Then User should be logged into account page

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'abadjan89@gmail.com' and password 'Jan@123456'
    And User click on login button
    Then User should be logged in into Account
