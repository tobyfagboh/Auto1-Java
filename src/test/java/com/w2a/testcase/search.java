package com.w2a.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

public class search extends TestBase {

	@Test
	public void Search() throws InterruptedException, IOException {

		// Filter for First registration (Erstzulassung)
		Thread.sleep(4000);
		log.debug("SEARCH page Executed");
		// driver.findElement(By.id(OR.getProperty("emailId"))).sendKeys(OR.getProperty("userEmail"));
		Thread.sleep(3000);
		driver.findElement(By.linkText(OR.getProperty("Suche_LINKTEXT"))).click();
		driver.findElement(By.xpath(OR.getProperty("Erstzulassung_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("BelieBigBtn_XPATH"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("BelieBigYear2015_XPATH"))).click();
		Thread.sleep(7000);
		
		//Verify all cars are filtered by first registration (2015+)
		String verifyFilter = driver.findElement(By.xpath(OR.getProperty("ErstzulassungVon2015_XPATH"))).getText();
		System.out.println(verifyFilter + " :Filter is verified successfully");
		assertEquals(verifyFilter, "Erstzulassung von: 2015");

		//Sort cars by price descending (Hochster Preis)
	/*	driver.findElement(By.name(OR.getProperty("sortBy_NAME"))).click();
		driver.findElement(By.xpath(OR.getProperty("sortByHighestPrice_XPATH"))).click();
		Thread.sleep(3000);*/
		driver.findElement(By.name(OR.getProperty("sortBy_NAME"))).click();
		driver.findElement(By.xpath(OR.getProperty("sortByLowestPrice_XPATH"))).click();
		Thread.sleep(3000);
		
		//Verify all cars are sorted by price descending
		WebElement wholeBodyText = driver.findElement(By.xpath(OR.getProperty("sortByDropDownBtn_XPATH")));
		//System.out.println(verifySortBy + " :Sort by is verified successfully");
		//assertEquals(verifySortBy, "Niedrigster Preis");
		if(wholeBodyText.getText().contains("Niedrigster Preis")){

			System.out.println("Sorted by price:Low to high");
			
		log.debug("Test for search executed");

	}
	}
}
