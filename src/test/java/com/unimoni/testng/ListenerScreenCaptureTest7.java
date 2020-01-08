package com.unimoni.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListenerScreenCaptureTest7 extends Base {


	@Test
	public void testMethod1() {
		System.out.println("In test method1");
	}

	@Test
	public void testMethod2() {
		getDriver().findElement(By.name("uid")).sendKeys("mngr195463");
		getDriver().findElement(By.name("password")).sendKeys("password");
		getDriver().findElement(By.name("btnLogin")).click();
		System.out.println(getDriver().getTitle());
		
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		System.out.println("In test method3");
	}
}
