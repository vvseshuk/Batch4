package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		/*
		 * WebElement loginLink = driver.findElement(By.linkText("Login"));
		 * practiceLink.click();
		 */
		WebElement LoginLink2= driver.findElement(By.partialLinkText("Sign "));

		LoginLink2.click();
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.id("user_name"));
		userName.sendKeys("Naresh");
		
		
	}

}
