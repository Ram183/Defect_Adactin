$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefile2/Adactin_Feature.feature");
formatter.feature({
  "name": "To Validate the Adactin Hotel Webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate the adactin hotel with valid inputs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to launch the Google Chrome and pass the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToLaunchTheGoogleChromeAndPassTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Ramcrazy18",
        "Ram@123a"
      ]
    },
    {
      "cells": [
        "priyasuresh221",
        "supriya16"
      ]
    },
    {
      "cells": [
        "saraasif1",
        "saraasif"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToPassTheValidUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to select the search hotel page",
  "rows": [
    {
      "cells": [
        "location",
        "hotels",
        "roomtype",
        "numberofrooms",
        "checkindate",
        "checkoutdate",
        "adultsperroom",
        "childrenperroom"
      ]
    },
    {
      "cells": [
        "Adelaide",
        "Hotel Hervey",
        "Super Deluxe",
        "3",
        "06/03/2021",
        "10/03/2021",
        "3",
        "1"
      ]
    },
    {
      "cells": [
        "New York",
        "Hotel Sunshine",
        "Standard",
        "2",
        "11/03/2021",
        "14/03/2021",
        "4",
        "3"
      ]
    },
    {
      "cells": [
        "Paris",
        "Hotel Cornice",
        "Double",
        "4",
        "23/03/2021",
        "26/03/2021",
        "2",
        "4"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToSelectTheSearchHotelPage(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to select the radio button and click continue button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToSelectTheRadioButtonAndClickContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to fill the details and submit the form",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "billing address",
        "credit card no",
        "credit card type",
        "expiry month",
        "expiry year",
        "cvv"
      ]
    },
    {
      "cells": [
        "Ram",
        "A",
        "OMR,Chennai",
        "1234567890123456",
        "MAST",
        "10",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "priya",
        "Suresh",
        "OMR,Chennai",
        "6543210987654321",
        "AMEX",
        "6",
        "2021",
        "456"
      ]
    },
    {
      "cells": [
        "Sara",
        "Asif",
        "OMR,Chennai",
        "9876543210852074",
        "VISA",
        "2",
        "2021",
        "789"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToFillTheDetailsAndSubmitTheForm(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to get the order Id and conform the order get placed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Definition_2_Dim_Map.userHasToGetTheOrderIdAndConformTheOrderGetPlacedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
});