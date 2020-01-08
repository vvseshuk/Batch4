package com.unimoni.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverCommands1 {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		
		/*
		 * System.setProperty("webdriver.gecko.driver","C:\\browsers\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
		/*
		 * System.setProperty("webdriver.ie.driver","C:\\browsers\\IEDriverServer.exe");
		 * WebDriver driver = new InternetExplorerDriver();
		 */
		 
		driver.manage().window().maximize();		
		driver.get("https://learn.letskodeit.com/p/practice");
		System.out.println("Title:" + driver.getTitle());
		System.out.println("URL:" + driver.getCurrentUrl());		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();
		System.out.println("Executed");
	}

}
