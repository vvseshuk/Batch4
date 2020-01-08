package com.unimoni.testng;

import org.testng.annotations.Test;

public class Invocation3 {
	
	@Test(invocationCount = 7)
	public void loginTest() {
		System.out.println("Logged in successfully");
	}

}
