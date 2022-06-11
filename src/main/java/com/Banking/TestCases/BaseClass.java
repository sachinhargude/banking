package com.Banking.TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Banking.POMClasses.LoginPage;



public class BaseClass 
{
	WebDriver driver;
	Logger log = Logger.getLogger("BANKING");
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		log.info("URL is Open");
		PropertyConfigurator.configure("log4j.properties");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		LoginPage lp = new LoginPage(driver);
		lp.senduserID();
		log.info("Enter the UserID");
		
		lp.sendPassword();
		log.info("Enter the Password");
		
		lp.clickLoginButton();
		log.info("Click on LoginButton");
		
		lp.sendPin();
		log.info("Enter the Pin");
		
		lp.clickcontinueButton();
		log.info("Click on ContinueButton");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
