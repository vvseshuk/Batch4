package com.unimoni.testng;

import org.testng.annotations.Test;

public class PriorityExample6 {
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Logged in successfully");
	}

	@Test(priority = 0)
	public void composeMail() {
		System.out.println("Mail Sent");
	}
	
	@Test(priority = 2)
	public void article() {
		System.out.println("Article");
	}


}
