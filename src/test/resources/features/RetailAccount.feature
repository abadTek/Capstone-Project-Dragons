@Regression
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'abadjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @test9
  Scenario: Verify User can update Profile Information
    And User update Name 'Ahmadi' and Phone '530-709-6108'
    And User click on Update button
    Then user profile information should be updated

  @test2
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5431231588889778 | Abadullah  |               5 |           2023 |          001 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @test3
  Scenario: Verify User can edit Debit or Credit card
    And User click on Card to Eidt
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7698714579990042 | Abadullah  |               5 |           2023 |          003 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @test4
  Scenario: Verify User can remove Debit or Credit card
    And User click on Card to remove
    And User click on remove option of card section
    Then payment details should be removed

  @test5
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName         | phoneNumber  | streetAddress | apt | city  | state      | zipCode |
      | United States | Ahmadi Abadullah | 530-709-6108 | 1122kenny dr  |  01 | Linda | California |   95993 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @test6
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill  edit address form with below information
      | country       | fullName         | phoneNumber  | streetAddress  | apt | city | state      | zipCode |
      | United States | Ahmadi Abadullah | 234-678-9165 | 1535 AlfredWay |   3 | Yuba | California |   95993 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully

  @test7
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
