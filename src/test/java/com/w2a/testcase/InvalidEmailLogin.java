package com.w2a.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
@Test
public class InvalidEmailLogin extends TestBase {
	
	
	public void InvalidEmailLoginFails() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("Emails_Xpath"))).sendKeys(OR.getProperty("WrongEmail"));
		
		
		driver.findElement(By.xpath(OR.getProperty("Pass_Xpath"))).sendKeys(OR.getProperty("Pass"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("SignIn_Xpath"))).click();
		
		Thread.sleep(1000);
		
		WebElement errorMessage = driver.findElement(By.xpath(OR.getProperty("Error_Xpath")));
		
		Thread.sleep(3000);
		
		Assert.assertEquals(errorMessage.getText(),"Cannot log in, check your email and/or password.");
		
		
		
		
		
		
		
		
		
	}

}
