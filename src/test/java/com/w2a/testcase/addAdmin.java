package com.w2a.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class addAdmin extends TestBase{
	
	@Test(dataProvider="getData")
	public void addNewAdmin (String firstName, String lastName, String phoneNumer, String email, String gender, String dob) throws InterruptedException {
		
if (!TestUtil.isTestRunnable("addNewAdmin",excel)) {
			
			throw new SkipException("Skipping the test "+"addNewAdmin".toUpperCase()+ " as the Run Mode is NO");
			
		}

		click("adminBtn_XPATH");
		Thread.sleep(5000);
		click("addAminBtn_XPATH");
		type("firstName_ID",firstName);
		type("lastName_ID",lastName);
		type("phoneNumber_ID",phoneNumer);
		type("email_ID",email);
		select("gender_ID",gender);
		select("dob_XPATH",dob);
		click("saveBtn_XPATH");
		
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains("alerttext"));
		alert.accept();
		
		Assert.fail("Add new admin not succesful");
		
		Thread.sleep(2000);
	}
	
	@DataProvider
	public Object [] [] getData(){
		
		String sheetName = "addAdmin";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
			
			for (int colNum = 0; colNum < cols; colNum++) {

				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum); 
			}

		}

		return data;
		
	}

}
