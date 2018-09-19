package com.w2a.testcase;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginAsAdmin extends TestBase {
	Properties properties;
	@Test
	public void loginAsAdnin2() throws InterruptedException, IOException {
		Thread.sleep(3000);
		log.debug("Log in page Executed");
		driver.findElement(By.id(OR.getProperty("emailId"))).sendKeys(OR.getProperty("userEmail"));

		driver.findElement(By.id(OR.getProperty("passwordId"))).sendKeys(OR.getProperty("userPassword"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(OR.getProperty("signBtnCss"))).click();

		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("userManagementTxtXpath"))),
				"Unable to validate Homepage");
	
		log.debug("Log in successfully executed");
	}

}
