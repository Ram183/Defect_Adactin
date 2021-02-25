$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile/Adactin.feature");
formatter.feature({
  "name": "To validate the Adactin Hotel Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the Login functionality with valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to launch the google chrome and pass the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToLaunchTheGoogleChromeAndPassTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the valid username and password",
  "rows": [
    {
      "cells": [
        "Ramcrazy18",
        "Ram@123a"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToEnterTheValidUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to validate the home page of adactin",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToValidateTheHomePageOfAdactin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Home Page Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to select the options listed below",
  "rows": [
    {
      "cells": [
        "Adelaide",
        "Hotel Hervey",
        "Super Deluxe",
        "3",
        "28/02/2021",
        "06/03/2021",
        "3",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToSelectTheOptionsListedBelow(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToNavigateToNextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Select Hotel Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to select the radio button",
  "keyword": "When "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToSelectTheRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate into personal info page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToNavigateIntoPersonalInfoPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Book a Hotel Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to fill all the details listed below",
  "rows": [
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
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToFillAllTheDetailsListedBelow(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin_Hotel.clickTheBookNowButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027order_no\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.182)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-0NQOBMF3\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.182, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Ram\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:62797}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0a148079c6bfd4f2a0b7097bf5dfd123\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027order_no\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getAttribute(Unknown Source)\r\n\tat org.step.Adactin_Hotel.clickTheBookNowButton(Adactin_Hotel.java:137)\r\n\tat ✽.click the book now button(file:src/test/resources/featurefile/Adactin.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to get the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin_Hotel.userHasToGetTheOrderId()"
});
formatter.result({
  "status": "skipped"
});
});