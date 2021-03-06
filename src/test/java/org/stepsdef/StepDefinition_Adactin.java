package org.stepsdef;

import java.util.List;

import org.baseclass.Base_Class;
import org.junit.Assert;
import org.pojoclass.Adactin_Pojo_Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Adactin extends Base_Class {

	public Adactin_Pojo_Class a;
	
	
	@Given("user has to launch the google chrome and pass the Url")
	public void userHasToLaunchTheGoogleChromeAndPassTheUrl() {
		
		chromeBrowser("https://adactinhotelapp.com/");
	
	}

	@When("user has to enter the valid username and password")
	public void userHasToEnterTheValidUsernameAndPassword(io.cucumber.datatable.DataTable d) {
		
		List<List<String>> li = d.asLists();
	   
		sendKeys(a.getUserName(), li.get(0).get(0));
		sendKeys(a.getPassword(), li.get(0).get(1));
		
		
	}

	@And("user has to click the login button")
	public void userHasToClickTheLoginButton() {

		clickButton(a.getLogin());
		
	}

	@Then("user has to validate the home page of adactin")
	public void userHasToValidateTheHomePageOfAdactin() {
		
		System.out.println("Login Successfully Done");
		Assert.assertEquals("Login Successfully", "Hello ramcrazy18!", "Hello ramcrazy18!");
	
	}

	@When("user has to select the options listed below")
	public void userHasToSelectTheOptionsListedBelow(io.cucumber.datatable.DataTable dd) {
		
		List<List<String>> lis = dd.asLists();

	dropDown(a.getLocation(), lis.get(0).get(0));
	dropDown(a.getHotels(), lis.get(0).get(1));
	dropDown(a.getRoomType(), lis.get(0).get(2));
	dropDown(a.getNumberOfRooms(), lis.get(0).get(3));
	
	
	
	
	
	
	
	
	}

	@And("user has to click the search button")
	public void userHasToClickTheSearchButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user has to navigate to next page")
	public void userHasToNavigateToNextPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user has to select the radio button")
	public void userHasToSelectTheRadioButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@And("user has to click the continue button")
	public void userHasToClickTheContinueButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user has to navigate into personal info page")
	public void userHasToNavigateIntoPersonalInfoPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user has to fill all the details listed below")
	public void userHasToFillAllTheDetailsListedBelow(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@And("click the book now button")
	public void clickTheBookNowButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user has to get the Order Id")
	public void userHasToGetTheOrderId() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user has to logout successfully")
	public void userHasToLogoutSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
