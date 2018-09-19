package com.w2a.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginAsCM extends TestBase {

	@Test
	public void loginAsAdnin() throws InterruptedException, IOException {

		Thread.sleep(3000);
		log.debug("Log in page Executed");
		driver.findElement(By.xpath(OR.getProperty("Email"))).sendKeys(OR.getProperty("CmUserEmail"));

		driver.findElement(By.xpath(OR.getProperty("Password"))).sendKeys(OR.getProperty("CmPasswordId"));

		driver.findElement(By.xpath(OR.getProperty("ClickSignIn"))).click();

		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("userManagementTxtXpath"))),
				"Unable to validate Homepage");
		Thread.sleep(3000);
		log.debug("Log in s uccessfully executed");

	}

}
