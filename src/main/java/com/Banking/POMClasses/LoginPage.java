package com.Banking.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement userID;
	
	public void senduserID()
	{
		userID.sendKeys("LV6175");
	}
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("gurunath@200788");
	}
	
	@FindBy (xpath = "//button[@class='button-orange wide']")
	private WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	@FindBy (xpath = "//input[@id='pin']")
	private WebElement pin;
	
	public void sendPin()
	{
		pin.sendKeys("200788");
	}
	
	@FindBy (xpath = "//button[@class='button-orange wide']")
	private WebElement continueButton;
	
	public void clickcontinueButton()
	{
		continueButton.click();
	}
	
	
}
