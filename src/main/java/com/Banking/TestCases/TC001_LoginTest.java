package com.Banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.POMClasses.HomePage;



public class TC001_LoginTest extends BaseClass
{
	@Test
	public void loginTest()
	{
		String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actualTitle = driver.getTitle(); 
		log.info("Verify the Test Case");
		
		                                             
		                                              
		
		// Hard Assert
		Assert.assertEquals(actualTitle, expectedTitle);
		

		
		//take Screenshot
		//ScreenshotClass.takeScreenshot(driver);
			
			
		
	}
}
