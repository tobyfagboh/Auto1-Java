package com.w2a.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

public class search extends TestBase {

	@Test
	public void Search() throws InterruptedException, IOException {
		
		log.debug("SEARCH page Executed");

		Thread.sleep(3000);

		driver.findElement(By.xpath(OR.getProperty("Erstzulassung_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("BelieBigBtn_XPATH"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("BelieBigYear2015_XPATH"))).click();
		Thread.sleep(7000);

		//Verify all cars are filtered by first registration (2015+)
		String verifyFilter = driver.findElement(By.xpath(OR.getProperty("ErstzulassungVon2015_XPATH"))).getText();
		assertEquals(verifyFilter, "Erstzulassung von: 2015");

		//Sort cars by price descending (Hochster Preis)
		driver.findElement(By.name(OR.getProperty("sortBy_NAME"))).click();
		driver.findElement(By.xpath(OR.getProperty("sortByPriceDesc_XPATH"))).click();
		Thread.sleep(3000);

		// Verify all cars are sorted by price descending
		WebElement wholeBodyText = driver.findElement(By.xpath(OR.getProperty("sortByDropDownBtn_XPATH")));
		if (wholeBodyText.getText().contains("Hochster Preis")) {

		log.debug("Test for search executed");

		}
	}
}
