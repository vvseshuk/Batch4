package com.unimoni.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		List<WebElement> allAnchors = driver.findElements(By.tagName("a"));
		System.out.println("Anchors size: " + allAnchors.size());
		for(WebElement eachAnchor : allAnchors) {
			System.out.println("Anchor: " + eachAnchor.getText());
		}
		
	}

}
