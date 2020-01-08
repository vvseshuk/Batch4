package com.unimoni.testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample4 {
	private String userId_textbox_name = "uid";
	private String password_textbox_name = "password";
	private String login_button_name = "btnLogin";
	private String reset_button_name = "btnReset";
	WebDriver driver;

	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
	}

	public void setUserId(String userId) {
		driver.findElement(By.name(userId_textbox_name)).clear();
		driver.findElement(By.name(userId_textbox_name)).sendKeys(userId);
	}

	public void setPassword(String password) {
		driver.findElement(By.name(password_textbox_name)).clear();
		driver.findElement(By.name(password_textbox_name)).sendKeys(password);
	}

	public void clickOnLogin() {
		driver.findElement(By.name(login_button_name)).click();
	}

	public void clickOnReset() {
		driver.findElement(By.name(reset_button_name)).click();
	}

	public void reset() {
		clickOnReset();
	}

	@Test
	public void login() {
		String name = "mngr195463";
		String password = "rUzyqem";		
		setUserId(name);
		setPassword(password);
		clickOnLogin();
		String homePageTitle = driver.getTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(homePageTitle, "Guru99 Bank Manager HomePages ");
		softAssert.assertAll();
		Assert.assertEquals(homePageTitle, "Guru99 Bank Manager HomePage");
		System.out.println("After hard assertion");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
