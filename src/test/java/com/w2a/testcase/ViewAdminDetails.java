package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

import junit.framework.Assert;

public class ViewAdminDetails extends TestBase{

	@Test
	public void adminDetails() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("Email_Xpath"))).sendKeys(OR.getProperty("UseEmail"));
		
		
		driver.findElement(By.xpath(OR.getProperty("Password_Xpath"))).sendKeys(OR.getProperty("Pass"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("Sign_Xpath"))).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(OR.getProperty("AdminClick_Xpath"))).click();
		
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(OR.getProperty("AdminCard_Xpath"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(OR.getProperty("CloseButton_Xpath"))).click();

		Thread.sleep(2000);

		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("MyProfile_Xpath"))));
		
		Thread.sleep(5000);

	
}}
