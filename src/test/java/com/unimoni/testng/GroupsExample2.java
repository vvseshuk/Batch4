package com.unimoni.testng;

import org.testng.annotations.Test;

@Test(groups={"DesktopWeb"})
public class GroupsExample2 {
	
	@Test(groups = { "smokeTest", "functionalTest" })
	public void loginTest() {
		
		System.out.println("Logged in successfully");
	}

	@Test(groups = { "functionalTest" })
	public void composeMail() {
		System.out.println("Mail Sent");
	}

}
