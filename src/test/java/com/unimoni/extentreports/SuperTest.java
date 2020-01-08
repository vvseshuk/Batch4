package com.unimoni.extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTest {
private WebDriver driver;
	
	private WebDriverWait wait;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
	
	@BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();
 
        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver, 15);
 
        //Maximize Window
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/index.php");
    }
 
    @AfterClass
    public void teardown () {
        driver.quit();
    }

}
