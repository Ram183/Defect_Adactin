Feature: To validate the Adactin Hotel Login Functionality

  Scenario: To validate the Login functionality with valid username and password
    Given user has to launch the google chrome and pass the Url
    When user has to enter the valid username and password
      | Ramcrazy18     | Ram@123a  |
      | priyasuresh221 | supriya16 |
      | saraasif1      | saraasif  |
    And user has to click the login button
    Then user has to validate the home page of adactin

  Scenario: To validate the Home Page Functionality
    When user has to select the options listed below
      | Adelaide | Hotel Hervey   | Super Deluxe | 3 | 28/02/2021 | 05/03/2021 | 3 | 1 |
      | New York | Hotel Sunshine | Standard     | 2 | 11/03/2021 | 14/03/2021 | 4 | 3 |
      | Paris    | Hotel Cornice  | Double       | 4 | 23/03/2021 | 26/03/2021 | 2 | 4 |
    And user has to click the search button
    Then user has to navigate to next page

  Scenario: To validate the Select Hotel Page
    When user has to select the radio button
    And user has to click the continue button
    Then user has to navigate into personal info page

  Scenario: To validate the Book a Hotel Page
    When user has to fill all the details listed below
      | Ram   | A      | OMR,Chennai | 1234567890123456 | MAST | 10 | 2022 | 123 |
      | priya | Suresh | OMR,Chennai | 6543210987654321 | AMEX |  6 | 2021 | 456 |
      | Sara  | Asif   | OMR,Chennai | 9876543210852074 | VISA |  2 | 2021 | 789 |
    And click the book now button
    And user has to get the Order Id
    Then user has to logout successfully
