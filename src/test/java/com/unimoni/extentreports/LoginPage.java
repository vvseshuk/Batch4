package com.unimoni.extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	private String userId_textbox_name = "uid";
	private String password_textbox_name = "password";
	private String login_button_name = "btnLogin";
	private String reset_button_name = "btnReset";

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);		
	}
	
	public void setUserId(String userId) {
		getDriver().findElement(By.name(userId_textbox_name)).clear();
		getDriver().findElement(By.name(userId_textbox_name)).sendKeys(userId);
	}

	public void setPassword(String password) {
		getDriver().findElement(By.name(password_textbox_name)).clear();
		getDriver().findElement(By.name(password_textbox_name)).sendKeys(password);
	}
	
	public void clickOnLogin() {
		getDriver().findElement(By.name(login_button_name)).click();
	}

	public void clickOnReset() {
		getDriver().findElement(By.name(reset_button_name)).click();
	}

	public void login(String userId, String password) {
		setUserId(userId);
		setPassword(password);
		clickOnLogin();
	}

	public void reset() {
		clickOnReset();
	}
	
	
}
