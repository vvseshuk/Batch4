package com.unimoni.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeClass
	  public void beforeClass() {
		  System.out.println("In beforeClass...");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("In afterClass...");
	  }

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("In beforeMethod...");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("In afterMethod...");
	  }
}
