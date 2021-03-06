Feature: To Validate the Adactin Hotel Webpage

  Scenario: To Validate the adactin hotel with valid inputs
    Given user has to launch the Google Chrome and pass the url
    When user has to pass the valid username and password
      | username       | password  |
      | Ramcrazy18     | Ram@123a  |
      | priyasuresh221 | supriya16 |
      | saraasif1      | saraasif  |
    And user has to click the login button
    When user has to select the search hotel page
      | location | hotels         | roomtype     | numberofrooms | checkindate | checkoutdate | adultsperroom | childrenperroom |
      | Adelaide | Hotel Hervey   | Super Deluxe |             3 | 06/03/2021  | 10/03/2021   |             3 |               1 |
      | New York | Hotel Sunshine | Standard     |             2 | 11/03/2021  | 14/03/2021   |             4 |               3 |
      | Paris    | Hotel Cornice  | Double       |             4 | 23/03/2021  | 26/03/2021   |             2 |               4 |
    And user has to click the search button
    When user has to select the radio button and click continue button
    And user has to fill the details and submit the form
      | firstname | lastname | billing address | credit card no   | credit card type | expiry month | expiry year | cvv |
      | Ram       | A        | OMR,Chennai     | 1234567890123456 | MAST             |           10 |        2022 | 123 |
      | priya     | Suresh   | OMR,Chennai     | 6543210987654321 | AMEX             |            6 |        2021 | 456 |
      | Sara      | Asif     | OMR,Chennai     | 9876543210852074 | VISA             |            2 |        2021 | 789 |
    Then user has to get the order Id and conform the order get placed successfully
