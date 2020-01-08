package com.unimoni.extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
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
	public BasePage(WebDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait = wait;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	

}
