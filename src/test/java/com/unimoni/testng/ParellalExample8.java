package com.unimoni.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellalExample8 {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void init(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title:" + driver.getTitle());

	}

	@Test
	public void googleSearch_one() throws InterruptedException {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ESCAPE);

		WebElement search = driver.findElement(By.name("btnK"));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
