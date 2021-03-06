$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile1/Adactin_Feature.feature");
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
  "location": "Step_Definition_Class.userHasToLaunchTheGoogleChromeAndPassTheUrl()"
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
        "Ramcrazy18"
      ]
    },
    {
      "cells": [
        "password",
        "Ram@123a"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToPassTheValidUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToClickTheLoginButton()"
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
        "Adelaide"
      ]
    },
    {
      "cells": [
        "hotels",
        "Hotel Hervey"
      ]
    },
    {
      "cells": [
        "roomtype",
        "Super Deluxe"
      ]
    },
    {
      "cells": [
        "numberofrooms",
        "3"
      ]
    },
    {
      "cells": [
        "checkindate",
        "06/03/2021"
      ]
    },
    {
      "cells": [
        "checkoutdate",
        "10/03/2021"
      ]
    },
    {
      "cells": [
        "adultsperroom",
        "3"
      ]
    },
    {
      "cells": [
        "childrenperroom",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToSelectTheSearchHotelPage(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to select the radio button and click continue button",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToSelectTheRadioButtonAndClickContinueButton()"
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
        "Ram"
      ]
    },
    {
      "cells": [
        "lastname",
        "A"
      ]
    },
    {
      "cells": [
        "billing address",
        "OMR,Chennai"
      ]
    },
    {
      "cells": [
        "credit card no",
        "1234567890123456"
      ]
    },
    {
      "cells": [
        "credit card type",
        "MAST"
      ]
    },
    {
      "cells": [
        "expiry month",
        "10"
      ]
    },
    {
      "cells": [
        "expiry year",
        "2022"
      ]
    },
    {
      "cells": [
        "cvv",
        "123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToFillTheDetailsAndSubmitTheForm(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to get the order Id and conform the order get placed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Class.userHasToGetTheOrderIdAndConformTheOrderGetPlacedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
});