package com.tej.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tej.base.TestBase;



public class ThankYouPage extends TestBase{

	@FindBy(xpath="//h2[1]")
	private WebElement tyMsg;


	public ThankYouPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String readMsg() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(tyMsg));
		return tyMsg.getText();
	}
	
}
