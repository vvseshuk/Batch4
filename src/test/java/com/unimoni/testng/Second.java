package com.unimoni.testng;

import org.testng.annotations.Test;

public class Second extends BaseTest {
  @Test
  public void f() {
	  System.out.println("In second test...");
  }
  @Test
  public void g() {
	  System.out.println("In second test second method...");
  }
}
