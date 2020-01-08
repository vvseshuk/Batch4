package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementsOperations5 {

	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");

		if (driver.findElement(By.id("displayed-text")).isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is invisible");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click(); 
		if (driver.findElement(By.id("displayed-text")).isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is invisible");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click(); // Tapping to show
		if (driver.findElement(By.id("displayed-text")).isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is invisible");
		}
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Executed and closed driver successfully");

	}

}
