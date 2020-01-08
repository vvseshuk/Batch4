package com.unimoni.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenCapture17 {
	@Test
	public void captureScreenMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://learn.letskodeit.com/p/practice");
			WebElement signUp = driver.findElement(By.xpath("//a[@class='btn. btn-primary pull-right btn-lg' and @href='/sign_up']"));
			signUp.click();
		} catch (Exception e) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("D:\\ScreenCaptures\\Failed.png"));
		}
		driver.close();
		driver.quit();
	}
}
