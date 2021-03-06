package org.step;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojoclass.Adactin_Pojo_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Adactin_Hotel extends Adactin_Pojo_Class {

	public Adactin_Pojo_Class a;

	@Given("user has to launch the google chrome and pass the Url")
	public void userHasToLaunchTheGoogleChromeAndPassTheUrl() {

		chromeBrowser("https://adactinhotelapp.com/");

	}

	@When("user has to enter the valid username and password")
	public void userHasToEnterTheValidUsernameAndPassword(io.cucumber.datatable.DataTable dd) {

		a = new Adactin_Pojo_Class();

		List<String> li = dd.asList();

		sendKeys(a.getUserName(), li.get(0));
		sendKeys(a.getPassword(), li.get(1));

	}

	@And("user has to click the login button")
	public void userHasToClickTheLoginButton() {

		clickButton(a.getLogin());
	}

	@Then("user has to validate the home page of adactin")
	public void userHasToValidateTheHomePageOfAdactin() {

		WebElement userNameShow2 = a.getUserNameShow();
		System.out.println(userNameShow2.getAttribute("value"));
		Assert.assertEquals("Login Successfully", "Hello ramcrazy18!", "Hello ramcrazy18!");

	}

	@When("user has to select the options listed below")
	public void userHasToSelectTheOptionsListedBelow(io.cucumber.datatable.DataTable d) {

		a = new Adactin_Pojo_Class();

		List<String> li = d.asList();

		dropDown(a.getLocation(), li.get(0));
		dropDown(a.getHotels(), li.get(1));
		dropDown(a.getRoomType(), li.get(2));
		dropDown(a.getNumberOfRooms(), li.get(3));
		WebElement checkInDate2 = a.getCheckInDate();
		checkInDate2.clear();
		sendKeys(a.getCheckInDate(), li.get(4));
		WebElement checkOutDate2 = a.getCheckOutDate();
		checkOutDate2.clear();
		sendKeys(a.getCheckOutDate(), li.get(5));
		dropDown(a.getAdultPerRoom(), li.get(6));
		dropDown(a.getChildrenPerRoom(), li.get(7));

	}

	@And("user has to click the search button")
	public void userHasToClickTheSearchButton() {

		clickButton(a.getSearchButton());
	}

	@Then("user has to navigate to next page")
	public void userHasToNavigateToNextPage() {

		Assert.assertEquals("Logged Into Select Hotel Page", "Select Hotel ", "Select Hotel ");
	}

	@When("user has to select the radio button")
	public void userHasToSelectTheRadioButton() {

		a = new Adactin_Pojo_Class();

		clickButton(a.getRadioButton());

	}

	@And("user has to click the continue button")
	public void userHasToClickTheContinueButton() {

		clickButton(a.getContinueButton());

	}

	@Then("user has to navigate into personal info page")
	public void userHasToNavigateIntoPersonalInfoPage() {

		Assert.assertEquals("Logged into Book A Hotel", "Book A Hotel ", "Book A Hotel ");

	}

	@When("user has to fill all the details listed below")
	public void userHasToFillAllTheDetailsListedBelow(io.cucumber.datatable.DataTable data) {

		a = new Adactin_Pojo_Class();
		List<String> les = data.asList();

		sendKeys(a.getFirstName(), les.get(0));
		sendKeys(a.getLastName(), les.get(1));
		sendKeys(a.getAddress(), les.get(2));
		sendKeys(a.getCreditCardNo(), les.get(3));
		dropDown(a.getCreditCardType(), les.get(4));
		dropDown(a.getExpiryMonth(), les.get(5));
		dropDown(a.getExpiryYear(), les.get(6));
		sendKeys(a.getCvv(), les.get(7));

	}
	
	@And("click the book now button")
	public void clickTheBookNowButton() {

		driver.findElement(By.xpath("//input[@id='book_now']")).click();

	}

	@When("user has to get the Order Id")
	public void userHasToGetTheOrderId() {
		
		a = new Adactin_Pojo_Class();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(25, TimeUnit.SECONDS).pollingEvery(25, TimeUnit.MILLISECONDS).ignoring(Throwable.class);

		WebElement myItinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", myItinerary);
		
		WebElement orderId2 = driver.findElement(By.xpath("//input[@name='order_no']"));
		
		System.out.println("OrderId: " + orderId2.getAttribute("value"));

		
	}

	@Then("user has to logout successfully")
	public void userHasToLogoutSuccessfully() {
		
		WebElement logOut = driver.findElement(By.xpath("//input[@id='logout']"));
		logOut.click();
	}
	
	}
