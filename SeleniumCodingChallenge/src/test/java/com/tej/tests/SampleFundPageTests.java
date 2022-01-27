package com.tej.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tej.base.TestBase;
import com.tej.pages.SampleFundPage;

public class SampleFundPageTests extends TestBase{

	public SampleFundPage sampleFundPage;
	public SampleFundPageTests() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		sampleFundPage = new SampleFundPage();
	}
	
	@Test
	public void verifyPageTitle() {
		String pageTitle = sampleFundPage.verifyTitle();
		Assert.assertEquals(pageTitle, prop.getProperty("title") , prop.getProperty("titleError"));
	}
	
	@Test
	public void verifyFirstName() {
		Assert.assertTrue(sampleFundPage.verifyFirstName()); 
	}
	
	@Test
	public void submitFormTest() {
		sampleFundPage.submitForm();
		//do assert for  thank you page
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
