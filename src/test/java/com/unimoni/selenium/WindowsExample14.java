package com.unimoni.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsExample14 {
	
	@Test
	public void TestAlerts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();

		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String currentWindow : allWindows) {
			
			if (!currentWindow.equals(parentWindow)) {
				Thread.sleep(2000);
				driver.switchTo().window(currentWindow);
				WebElement practice = driver.findElement(By.linkText("Practice"));
				practice.click();
				Thread.sleep(4000);
			}
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(4000);
		driver.quit();
	}
}
