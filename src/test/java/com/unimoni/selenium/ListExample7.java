package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListExample7 {
	
	@Test
	public void list() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://learn.letskodeit.com/p/practice");

		Select oSelect = new Select(driver.findElement(By.id("multiple-select-example")));
		oSelect.selectByIndex(1);
		Thread.sleep(3000);
		oSelect.selectByIndex(2);
		Thread.sleep(3000);
		// Or can be used as
		// oSelect.selectByVisibleText("Apple");
		// oSelect.selectByVisibleText("Peach");
		// Or can be used as
		// oSelect.selectByValue("apple");
		// oSelect.selectByValue("orange");
		driver.quit();
		System.out.println("Executed and closed driver successfully");
	}

}
