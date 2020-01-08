package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement signUp = driver.findElement(By.xpath("/html/body/header/div/div/div/div/ul/li[3]"));
		signUp.click();
	}

}
