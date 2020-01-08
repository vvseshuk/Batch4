package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement signUp = driver.findElement(By.xpath("//a[@id='header-sign-up-btn']"));
		signUp.click();
		//a[@id='header-sign-up-btn']
		//div/div/div/div/ul/li[3]/a[contains(text(),'Sign Up')][1]
		//label[starts-with(@id,'message')]
		//*[@type='text']//following::input
		//*[@type='reset']//preceding::input
		//*[@type='submit']//following-sibling::input
		//*[@id='java_technologies']//ancestor::div
		//*[@id='java_technologies']//child::li
		//*[@id='java_technologies']//parent::div

		
	}

}
