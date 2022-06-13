package com.Banking.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass {
	WebDriver driver;

	public HomePagePomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='button-blue'])[1]")
	private WebElement invest;

	public void invest() {
		invest.click();
	}

	@FindBy(xpath = "(//input[@icon='search'])[2]")
	private WebElement searchBar;

	public void searchBar() {
		searchBar.sendKeys("Rcom");
	}

	@FindBy(xpath = "(//span[@class='tradingsymbol'])[1]")
	private WebElement share;

	public void share() {
		share.click();
	}

	@FindBy(xpath = "(//button[@class='button-outline button-blue'])[2]")
	private WebElement buyButton;

	public void buyButton() {
		buyButton.click();
	}

	@FindBy(xpath = "//input[@label='Qty.']")
	private WebElement qty;

	public void qty() {
		qty.sendKeys("5");
	}

	@FindBy(xpath = "(//label[@class='su-radio-label'])[8]")
	private WebElement marketType;

	public void marketType() {
		marketType.click();
	}

	@FindBy(xpath = "//button[@class='submit']")
	private WebElement placeOrder;

	public void placeOrder() {
		placeOrder.click();
	}

}
