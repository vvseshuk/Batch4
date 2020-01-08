package com.unimoni.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersExample7 extends Base implements ITestListener  {
	String filePath = "C:\\SCREENSHOTS\\";
	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult iTestResult) {
		//Get driver from BaseTest and assign to local webdriver variable.
        Object testClass = iTestResult.getInstance();
        WebDriver webDriver = ((Base) testClass).getDriver();
        String methodName = iTestResult.getName().toString().trim();
		System.out.println( webDriver.getTitle());
		System.out.println("The name of the testcase failed is :" + methodName);
		takeScreenShot(methodName, webDriver);

	}

	public void takeScreenShot(String methodName, WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
			System.out.println("***Placed screen shot in " + filePath + " ***");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

	// ISuiteListener, IInvokedMethodListener
	public void onFinish(ITestContext Result) {
	}

	public void onStart(ITestContext iTestContext) {
		iTestContext.setAttribute("WebDriver", getDriver());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
	}

}