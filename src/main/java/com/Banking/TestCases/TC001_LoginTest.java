package com.Banking.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.Utility.ScreenshotClass;

public class TC001_LoginTest extends BaseClass {
	@Test
	public void loginTest() throws IOException {
		String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actualTitle = driver.getTitle();
		log.info("Verify the Test Case");

		ScreenshotClass.ScreenShot(driver);
		// Hard Assert
		Assert.assertEquals(actualTitle, expectedTitle);

	}
}
