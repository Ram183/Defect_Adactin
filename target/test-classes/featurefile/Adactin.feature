Feature: To validate the Adactin Hotel Login Functionality

  Scenario: To validate the Login functionality with valid username and password
    Given user has to launch the google chrome and pass the Url
    When user has to enter the valid username and password
      | Ramcrazy18 | Ram@123a |
    And user has to click the login button
    Then user has to validate the home page of adactin

  Scenario: To validate the Home Page Functionality
    When user has to select the options listed below
      | Adelaide | Hotel Hervey | Super Deluxe | 3 | 28/02/2021 | 06/03/2021 | 3 | 1 |
    And user has to click the search button
    Then user has to navigate to next page

  Scenario: To validate the Select Hotel Page
    When user has to select the radio button
    And user has to click the continue button
    Then user has to navigate into personal info page

  Scenario: To validate the Book a Hotel Page
    When user has to fill all the details listed below
      | Ram | A | OMR,Chennai | 1234567890123456 | MAST | 10 | 2022 | 123 |
    And click the book now button
    Then user has to get the order id
