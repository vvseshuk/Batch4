package com.unimoni.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

public class DataProviderExample5 {

	private String userId_textbox_name = "uid";
	private String password_textbox_name = "password";
	private String login_button_name = "btnLogin";
	private String reset_button_name = "btnReset";

	private WebDriver driver;
	private WebDriverWait wait;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public void init() {
		setup();
	}

	@Test(dataProvider = "dp")
	public void login(String name, String password) {
		getDriver().findElement(By.name(userId_textbox_name)).sendKeys(name);
		getDriver().findElement(By.name(password_textbox_name)).sendKeys(password);
		getDriver().findElement(By.name(login_button_name)).click();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { { "mngr195463", "rUzyqem" }, { "mngr195463", "b" }, };
	}

	public void setup() {
		// Create a Chrome driver. All test classes use this.
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();

		// Create a wait. All test classes use this.
		wait = new WebDriverWait(driver, 15);

		// Maximize Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/index.php");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
