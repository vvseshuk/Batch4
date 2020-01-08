package com.unimoni.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class First extends BaseTest {
  @Test
  public void f() {
	  System.out.println("In first test...");
  }
  @Test
  public void g() {
	  System.out.println("In first test second method...");
  }
  

  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In beforeTest...");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("In afterTest...");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In beforeSuite...");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In afterSuite...");
  }

}
