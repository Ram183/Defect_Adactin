Feature: To Validate the Adactin Hotel Webpage

  Scenario: To Validate the adactin hotel with valid inputs
    Given user has to launch the Google Chrome and pass the url
    When user has to pass the valid username and password
      | username | Ramcrazy18 |
      | password | Ram@123a   |
    And user has to click the login button
    When user has to select the search hotel page
      | location        | Adelaide     |
      | hotels          | Hotel Hervey |
      | roomtype        | Super Deluxe |
      | numberofrooms   |            3 |
      | checkindate     | 06/03/2021   |
      | checkoutdate    | 10/03/2021   |
      | adultsperroom   |            3 |
      | childrenperroom |            1 |
    And user has to click the search button
    When user has to select the radio button and click continue button
    And user has to fill the details and submit the form
      | firstname        | Ram              |
      | lastname         | A                |
      | billing address  | OMR,Chennai      |
      | credit card no   | 1234567890123456 |
      | credit card type | MAST             |
      | expiry month     |               10 |
      | expiry year      |             2022 |
      | cvv              |              123 |
    Then user has to get the order Id and conform the order get placed successfully
