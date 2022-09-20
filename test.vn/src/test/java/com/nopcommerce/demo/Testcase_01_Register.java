package com.nopcommerce.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.RegisterPageObjects;

public class Testcase_01_Register extends BaseTest{
	WebDriver driver;
	RegisterPageObjects registerPage;
	
	@Parameters({"browser"}	)
	
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	@Test
	public void TC_01_RegisterWithEmptyData() {
		registerPage = new RegisterPageObjects(driver);
		registerPage.clickToRegisterButton();
		
		Assert.assertTrue(registerPage.isFirstNameErrorMessageDisplay("First name is required."));
		
		Assert.assertTrue(registerPage.isLastNameErrorMessageDisplay("Last name is required."));
		
		Assert.assertTrue(registerPage.isEmailErrorMessageDisplay("Email is required."));
	}
}
