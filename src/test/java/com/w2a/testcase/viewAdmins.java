/*package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class viewAdmins {
	
	@Testc
	public void adminView () { 
		
		log.debug("Log in page Executed");
		
		driver.findElement(By.xpath(OR.getProperty("signInBtnXpath"))).click();
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("userManagementTxtXpath"))), "Login Not Successful");
		
		Thread.sleep(3000);
		
	}
	
	@DataProvider
	public Object [] [] getData(){
		
	}

}
*/