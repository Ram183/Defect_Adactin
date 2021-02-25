package org.pojoclass;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pojo_Class extends Base_Class {

	public Adactin_Pojo_Class() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(id = "username_show")
	private WebElement UserNameShow;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement numberOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@FindBy(id = "adult_room")
	private WebElement adultPerRoom;

	@FindBy(id = "child_room")
	private WebElement childrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement searchButton;

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	@FindBy(id = "continue")
	private WebElement continueButton;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCardNo;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myItinerary;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderId;

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logOut;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUserNameShow() {
		return UserNameShow;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
