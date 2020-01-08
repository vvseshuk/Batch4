package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesExample13 {
	
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		// Before
		// Tapping on menuBar
		// driver.findElement(By.className("navbar-toggle")).click();
		// driver.findElement(By.linkText("Practice")).click();

		// After
		// Now try with iFrame
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		// How to switch over the elements in iframes using Web Driver commands:
		// Basically, we can switch over the elements in frames using 3 ways.
		//
		// By Index
		// By Name or Id
		// By Web Element

		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.className("navbar-toggle")).click(); // Menu

		driver.findElement(By.linkText("Practice")).click();
		
		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		driver.quit();
		System.out.println("Executed and closed driver successfully");

	}

}
