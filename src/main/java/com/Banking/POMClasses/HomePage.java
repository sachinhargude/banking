package com.Banking.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy( xpath = "//a[text()='Log out']")
	private WebElement logoutButton;
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	//input[@type='text']       for search
	
	//span[@class='symbol']  in my watch list 11 shares to showing 1 out of 11
	
	//button[@class='button-blue buy']         
	
	//button[@class='button-orange sell']
	
	
}
