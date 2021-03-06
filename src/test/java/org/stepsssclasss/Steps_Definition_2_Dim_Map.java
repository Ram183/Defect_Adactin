package org.stepsssclasss;

import java.util.List;
import java.util.Map;

import org.baseclass.Base_Class;
import org.pojoclass.Adactin_Pojo_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Definition_2_Dim_Map extends Base_Class {

	Adactin_Pojo_Class a;

	@Given("user has to launch the Google Chrome and pass the url")
	public void userHasToLaunchTheGoogleChromeAndPassTheUrl() {

		chromeBrowser("https://adactinhotelapp.com/");
	}

	@When("user has to pass the valid username and password")
	public void userHasToPassTheValidUsernameAndPassword(io.cucumber.datatable.DataTable d) {

		a = new Adactin_Pojo_Class();

		List<Map<String, String>> m = d.asMaps(String.class, String.class);

		sendKeys(a.getUserName(), m.get(2).get("username"));
		sendKeys(a.getPassword(), m.get(2).get("password"));

	}

	@And("user has to click the login button")
	public void userHasToClickTheLoginButton() {

		a = new Adactin_Pojo_Class();

		clickButton(a.getLogin());

		System.out.println("********************");

		getAttribute(a.getUserNameShow());

		System.out.println("********************");

	}

	@When("user has to select the search hotel page")
	public void userHasToSelectTheSearchHotelPage(io.cucumber.datatable.DataTable dd) {

		a = new Adactin_Pojo_Class();

		List<Map<String, String>> ma = dd.asMaps(String.class, String.class);

		selectOptions(a.getLocation(), ma.get(2).get("location"));

		selectOptions(a.getHotels(), ma.get(2).get("hotels"));

		selectOptions(a.getRoomType(), ma.get(2).get("roomtype"));

		selectOptions(a.getNumberOfRooms(), ma.get(2).get("numberofrooms"));

		clear(a.getCheckInDate());

		sendKeys(a.getCheckInDate(), ma.get(2).get("checkindate"));

		clear(a.getCheckOutDate());

		sendKeys(a.getCheckOutDate(), ma.get(2).get("checkoutdate"));

		selectOptions(a.getAdultPerRoom(), ma.get(2).get("adultsperroom"));

		selectOptions(a.getChildrenPerRoom(), ma.get(2).get("childrenperroom"));

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

		List<Map<String, String>> me = dds.asMaps(String.class, String.class);

		sendKeys(a.getFirstName(), me.get(2).get("firstname"));

		sendKeys(a.getLastName(), me.get(2).get("lastname"));

		sendKeys(a.getAddress(), me.get(2).get("billing address"));

		sendKeys(a.getCreditCardNo(), me.get(2).get("credit card no"));

		selectOptions(a.getCreditCardType(), me.get(2).get("credit card type"));

		selectOptions(a.getExpiryMonth(), me.get(2).get("expiry month"));

		selectOptions(a.getExpiryYear(), me.get(2).get("expiry year"));

		sendKeys(a.getCvv(), me.get(2).get("cvv"));

		clickButton(a.getBookNow());

	}

	@Then("user has to get the order Id and conform the order get placed successfully")
	public void userHasToGetTheOrderIdAndConformTheOrderGetPlacedSuccessfully() {

		a = new Adactin_Pojo_Class();

		scrollDown(a.getMyItinerary());

		System.out.println("*********************");

		getAttribute(a.getOrderId());

		System.out.println("*********************");

		quitBrowser();

	}

}
