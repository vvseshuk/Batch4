package com.unimoni.selenium;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadWithAutoIt15 {
//https://www.toolsqa.com/selenium-webdriver/autoit-selenium-webdriver/
	private static WebDriver driver = null;

	@Test
	public void main() throws IOException, InterruptedException {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form");
		WebElement browse = driver.findElement(By.id("photo"));
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(browse).build().perform();
		 */
		
		//Thread.sleep(3000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView();", browse);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", browse);

		// driver.findElement(By.id("photo")).click();
		System.out.println("Got to this...");
		Thread.sleep(5000);
		try {
			Runtime.getRuntime().exec("E:\\Seshu\\Softs\\AutoIt3\\MyExamples\\FileUpload.exe");
		} catch (Exception e) {
			System.out.println("got error..");
			e.printStackTrace();
			
		}

		System.out.println("Ran it..");
		//Thread.sleep(5000);

		//driver.close();

	}

}
