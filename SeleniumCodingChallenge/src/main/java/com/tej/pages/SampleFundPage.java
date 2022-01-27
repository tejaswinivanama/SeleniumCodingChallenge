package com.tej.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tej.base.TestBase;



public class SampleFundPage extends TestBase{

	@FindBy(xpath="//a[@class='v_gao'][1]")
	private WebElement gift25;

	@FindBy(name="FirstName")
	private WebElement firstName;

	@FindBy(name="LastName")
	private WebElement lastName;

	@FindBy(name="Email")
	private WebElement email;

	@FindBy(name="Address1")
	private WebElement addressLine1;

	@FindBy(name="City")
	private WebElement city;

	@FindBy(xpath="//div[@class='Select-placeholder']")
	private WebElement state;

	@FindBy(name="PostalCode")
	private WebElement zipCode;

	@FindBy(name="CreditCardNumber")
	private WebElement creditCardNum;

	@FindBy(name="Expiration")
	private WebElement expiration;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(name="CVV")
	private WebElement cvv;

	public SampleFundPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyFirstName() {
		return firstName.isDisplayed();
	}
	public void submitForm() {
		gift25.click();
		firstName.sendKeys(prop.getProperty("firstName"));
		lastName.sendKeys(prop.getProperty("lastName"));
		email.sendKeys(prop.getProperty("email"));
		zipCode.sendKeys(prop.getProperty("zipCode"));
		creditCardNum.sendKeys(prop.getProperty("creditCardNum"));
		expiration.sendKeys(prop.getProperty("expiration"));
		cvv.sendKeys(prop.getProperty("cvv"));
		submitBtn.click();

	}

}
