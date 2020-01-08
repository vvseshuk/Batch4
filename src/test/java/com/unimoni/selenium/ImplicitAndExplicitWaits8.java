package com.unimoni.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWaits8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofMillis(2000)) .pollingEvery(Duration.ofMillis(100))
		 * .ignoring(Exception.class);
		 */
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Click me to start')]"));
		button.click();
		WebElement para = driver.findElement(By.id("demo"));
		Wait<WebDriver> wait = new WebDriverWait(driver,2000);
		wait.until(ExpectedConditions.textToBePresentInElement(para, "QTP"));
		System.out.println("The element value got : " + para.getText());
		Thread.sleep(2000);
		driver.quit();

	}

}
