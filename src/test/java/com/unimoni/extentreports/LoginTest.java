package com.unimoni.extentreports;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;
 
public class LoginTest extends SuperTest {

	@Test (priority = 0, description="Valid Login Scenario with correct username and password.")
    public void validLoginTest(Method method) {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(),"Valid Login Scenario with correct username and password.");
 
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(getDriver(),getWait());
        LoginPage loginPage = new LoginPage(getDriver(),getWait());
        
        
 
        //*************PAGE METHODS********************
        //Login to sample bank application
        loginPage.login("mngr188455", "ejarEdU");
        //getDriver().switchTo().alert().accept();
 
        //*************ASSERTIONS***********************
        // Guru99 Bank Home Page 
        String homeTitle = homePage.getPageTitle();
        assertEquals(homeTitle, "Guru99 Bank Manager HomePage");
    }
 
}
