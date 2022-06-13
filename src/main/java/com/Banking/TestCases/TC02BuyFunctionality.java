package com.Banking.TestCases;

import org.testng.annotations.Test;

import com.Banking.POMClasses.HomePagePomClass;

public class TC02BuyFunctionality extends BaseClass {
	@Test
	public void buyingTest() throws InterruptedException {
		HomePagePomClass hp = new HomePagePomClass(driver);

		hp.invest();
		log.info("clicked in start invest");
		hp.searchBar();
		Thread.sleep(2000);
		log.info("Rcom share name provided");
		hp.share();
		log.info("clicked on share");
		hp.buyButton();
		Thread.sleep(2000);
		log.info("Clicked On Buy Button");

		hp.qty();

		log.info("add qty 5");

		hp.marketType();
		log.info("select market type");
		hp.placeOrder();
		log.info("clicked on Buy button");
	}

}
