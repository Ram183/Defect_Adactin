package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojoclass.Adactin_Pojo_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition_Class extends Base_Class {

	public Adactin_Pojo_Class ad;

	@Given("user has to launch the Google Chrome and pass the url")
	public void userHasToLaunchTheGoogleChromeAndPassTheUrl() {

		chromeBrowser("https://adactinhotelapp.com/");

	}

	@When("user has to pass the valid username and password")
	public void userHasToPassTheValidUsernameAndPassword() {

		ad = new Adactin_Pojo_Class();

		sendKeys(ad.getUserName(), "ramcrazy18");
		sendKeys(ad.getPassword(), "Ram@123a");
	}

	@And("user has to click the login button")
	public void userHasToClickTheLoginButton() {

		clickButton(ad.getLogin());
	}

	@When("user has to select the search hotel page")
	public void userHasToSelectTheSearchHotelPage() {

		dropDown(ad.getLocation(), "New York");
		dropDown(ad.getHotels(), "Hotel Cornice");
		dropDown(ad.getRoomType(), "Super Deluxe");
		dropDown(ad.getNumberOfRooms(), "6");

		WebElement checkInDate = ad.getCheckInDate();
		checkInDate.clear();
		sendKeys(ad.getCheckInDate(), "03/03/2021");
		
		WebElement checkOutDate = ad.getCheckOutDate();
		checkOutDate.clear();
		sendKeys(ad.getCheckOutDate(), "09/03/2021");
		
		dropDown(ad.getAdultPerRoom(), "3");
		dropDown(ad.getChildrenPerRoom(), "4");
		clickButton(ad.getSearchButton());

	}

	@And("user has to check the selected option")
	public void userHasToCheckTheSelectedOption() {

		clickButton(ad.getRadioButton());
		clickButton(ad.getContinueButton());
	}

	@Then("user has to fill the details to book an order")
	public void userHasToFillTheDetailsToBookAnOrder() throws InterruptedException {

		sendKeys(ad.getFirstName(), "Ram");
		sendKeys(ad.getLastName(), "A");
		sendKeys(ad.getAddress(), "Omr, Chennai");
		sendKeys(ad.getCreditCardNo(), "1234567890123456");
		dropDown(ad.getCreditCardType(), "VISA");
		dropDown(ad.getExpiryMonth(), "6");
		dropDown(ad.getExpiryYear(), "2022");
		sendKeys(ad.getCvv(), "123");
		clickButton(ad.getBookNow());
		Thread.sleep(5000);
		scrollDown(ad.getMyItinerary());
		WebElement orderId = ad.getOrderId();
		System.out.println("OrderId: " + orderId.getAttribute("value"));
		clickButton(ad.getLogOut());
	}
}