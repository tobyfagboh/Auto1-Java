package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginAsCM extends TestBase {

	@Test
	public void loginAsCMM() throws InterruptedException, IOException {

		Thread.sleep(3000);
		log.debug("Log in page Executed");
		driver.findElement(By.xpath(OR.getProperty("Email_Xpath"))).sendKeys(OR.getProperty("CmUserEmail_Xpath"));

		driver.findElement(By.xpath(OR.getProperty("Password_Xpath"))).sendKeys(OR.getProperty("CmPassword_Xpath"));

		driver.findElement(By.xpath(OR.getProperty("ClickSignIn_Xpath"))).click();

		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("userManagementTxtXpath"))),
				"Unable to validate Homepage");
		Thread.sleep(3000);
		log.debug("Log in s uccessfully executed");

	}

}
