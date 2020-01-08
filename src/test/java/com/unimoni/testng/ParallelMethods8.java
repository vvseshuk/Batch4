package com.unimoni.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelMethods8 {
	@Test
	public void googleSearch_one() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ENTER);				
	}

	@Test
	public void gmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.gmail.com/");
		System.out.println("Title:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Gmail");
						
	}

}
