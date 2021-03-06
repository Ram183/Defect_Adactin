package org.stepdefine;

import java.util.Map;

import org.baseclass.Base_Class;
import org.pojoclass.Adactin_Pojo_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Step_Definition_Class extends Base_Class {

	public Adactin_Pojo_Class a;

	@Given("user has to launch the Google Chrome and pass the url")
	public void userHasToLaunchTheGoogleChromeAndPassTheUrl() {

		chromeBrowser("https://adactinhotelapp.com");
	}

	@When("user has to pass the valid username and password")
	public void userHasToPassTheValidUsernameAndPassword(io.cucumber.datatable.DataTable d) {

		a = new Adactin_Pojo_Class();

		Map<String, String> as = d.asMap(String.class, String.class);

		sendKeys(a.getUserName(), as.get("username"));
		sendKeys(a.getPassword(), as.get("password"));
	}

	@And("user has to click the login button")
	public void userHasToClickTheLoginButton() {

		a = new Adactin_Pojo_Class();

		clickButton(a.getLogin());

		System.out.println("******************");
		
		Assert.assertEquals("Logged in Successfully", "Hello ramcrazy18!", "Hello ramcrazy18!");

		getAttribute(a.getUserNameShow());

		System.out.println("******************");

	}

	@When("user has to select the search hotel page")
	public void userHasToSelectTheSearchHotelPage(io.cucumber.datatable.DataTable dd) {

		a = new Adactin_Pojo_Class();

		Map<String, String> ma = dd.asMap(String.class, String.class);

		selectOptions(a.getLocation(), ma.get("location"));
		
		selectOptions(a.getHotels(), ma.get("hotels"));
		
		selectOptions(a.getRoomType(), ma.get("roomtype"));
		
		selectOptions(a.getNumberOfRooms(), ma.get("numberofrooms"));
		
		clear(a.getCheckInDate());
		sendKeys(a.getCheckInDate(), ma.get("checkindate"));
		
		clear(a.getCheckOutDate());
		sendKeys(a.getCheckOutDate(), ma.get("checkoutdate"));
		
		selectOptions(a.getAdultPerRoom(), ma.get("adultsperroom"));
		
		selectOptions(a.getChildrenPerRoom(), ma.get("childrenperroom"));
		
	}

	@And("user has to click the search button")
	public void userHasToClickTheSearchButton() {
		
		a = new Adactin_Pojo_Class();
		
		clickButton(a.getSearchButton());

	}

	@When("user has to select the radio button and click continue button")
	public void userHasToSelectTheRadioButtonAndClickContinueButton() {
		
		a = new Adactin_Pojo_Class();
		
		clickButton(a.getRadioButton());
		clickButton(a.getContinueButton());

	}

	@And("user has to fill the details and submit the form")
	public void userHasToFillTheDetailsAndSubmitTheForm(io.cucumber.datatable.DataTable dds) {

		a = new Adactin_Pojo_Class();
		
		Map<String, String> map = dds.asMap(String.class, String.class);
		
		sendKeys(a.getFirstName(), map.get("firstname"));
		sendKeys(a.getLastName(), map.get("lastname"));
		sendKeys(a.getAddress(), map.get("billing address"));
		sendKeys(a.getCreditCardNo(), map.get("credit card no"));
		selectOptions(a.getCreditCardType(), map.get("credit card type"));
		selectOptions(a.getExpiryMonth(), map.get("expiry month"));
		selectOptions(a.getExpiryYear(), map.get("expiry year"));
		sendKeys(a.getCvv(), map.get("cvv"));
		clickButton(a.getBookNow());
	}

	@Then("user has to get the order Id and conform the order get placed successfully")
	public void userHasToGetTheOrderIdAndConformTheOrderGetPlacedSuccessfully() {

		a = new Adactin_Pojo_Class();
		
		scrollDown(a.getMyItinerary());
		System.out.println("***********************");
		getAttribute(a.getOrderId());
		System.out.println("***********************");
		
		quitBrowser();
	}
}
