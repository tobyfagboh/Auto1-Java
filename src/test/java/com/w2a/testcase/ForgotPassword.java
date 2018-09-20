package com.w2a.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class ForgotPassword extends TestBase {

	@Test
	public void ForgotPasswordClick() throws InterruptedException {
		
		
		driver.findElement(By.xpath(OR.getProperty("ForgotPass_Xpath"))).click();
		
		Thread.sleep(2000);
		
		
        driver.findElement(By.xpath(OR.getProperty("RegEmail_Xpath"))).sendKeys(OR.getProperty("UserEmail_Xpath"));
        
        driver.findElement(By.xpath(OR.getProperty("ResetPassBut_Xpath"))).click();
		
		Thread.sleep(2000);
		
       WebElement errorMessage = driver.findElement(By.xpath(OR.getProperty("ResetAlert")));
		
		Assert.assertEquals(errorMessage.getText(),"Reset requested. Check your email instructions.");
		
		
		Thread.sleep(1000);
	}
}
