package com.tej.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tej.base.TestBase;
import com.tej.pages.SampleFundPage;
import com.tej.pages.ThankYouPage;

public class SampleFundPageTests extends TestBase{

	public SampleFundPage sampleFundPage;
	public ThankYouPage thankyouPage;
	public SampleFundPageTests() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		sampleFundPage = new SampleFundPage();
		thankyouPage = new ThankYouPage();
	}
	
	//@Test
	public void verifyPageTitle() {
		String pageTitle = sampleFundPage.verifyTitle();
		Assert.assertEquals(pageTitle, prop.getProperty("title") , prop.getProperty("titleError"));
	}
	
	//@Test
	public void verifyFirstName() {
		Assert.assertTrue(sampleFundPage.verifyFirstName()); 
	}
	
	@Test
	public void submitFormTest() {
		thankyouPage=sampleFundPage.submitForm();	
		Assert.assertEquals(thankyouPage.readMsg(), "Thank you for your gift!  " , "Transaction was unsuccessful");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
