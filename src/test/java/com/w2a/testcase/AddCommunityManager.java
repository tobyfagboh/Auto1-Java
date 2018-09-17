package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCommunityManager extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCommunityManager (String communityName, String streetName, String country, String state, String lga) throws InterruptedException {
		
		click("adminBtn_XPATH");
		Thread.sleep(5000);
		click("addAminBtn_XPATH");
		type("firstName_ID",communityName);
	
		Thread.sleep(3000);
	}

}
