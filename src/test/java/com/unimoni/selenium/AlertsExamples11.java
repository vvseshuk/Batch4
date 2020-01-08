package com.unimoni.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsExamples11 {
	
	@Test
	public  void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("enter-name")).sendKeys("Unimoni");
		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(5000);
		
		Alert myAlert = driver.switchTo().alert();
		System.out.println("Alert message:" + myAlert.getText());
		myAlert.accept();
		
		driver.quit();
		System.out.println("Executed and closed driver successfully");

	}

}
