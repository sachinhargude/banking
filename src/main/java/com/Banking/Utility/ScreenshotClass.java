package com.Banking.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {

	private WebDriver driver;

	public static void ScreenShot(WebDriver driver) throws IOException {
		// this.driver = driver;
		// date & time format code
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
		String date = d1.format(d);

		// screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShots/TestResult" + date + ".jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("TestResult screenshot is taken");

	}
}
