package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonExample6 {
	
	@Test
	public void radio() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.id("bmwradio")).click();
		System.out.println("Selected BMW");
		Thread.sleep(3000);
		driver.findElement(By.id("benzradio")).click();
		System.out.println("Selected Benz");
		Thread.sleep(3000);
		driver.findElement(By.id("hondaradio")).click();
		System.out.println("Selected Honda");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Executed and closed driver successfully");
	}
}
