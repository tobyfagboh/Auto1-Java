package com.w2a.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class InvalidPassword extends TestBase {
	
	@Test
     public void InvalidEmailLoginFails() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("Username_Xpath"))).sendKeys(OR.getProperty("Email"));
		
		
		driver.findElement(By.xpath(OR.getProperty("Password_Xpath"))).sendKeys(OR.getProperty("Wrong_Password"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("SignIn_Xpath"))).click();
		
		Thread.sleep(1000);
		
		WebElement errorMessage = driver.findElement(By.xpath(OR.getProperty("Error_Xpath")));
		
		Thread.sleep(3000);
		
		Assert.assertEquals(errorMessage.getText(),"Cannot log in, check your email and/or password.");
	}
}