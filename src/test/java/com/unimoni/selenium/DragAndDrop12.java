package com.unimoni.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop12 {

	@Test
	public void dragAndDropEx() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		System.out.println("Performed drag and drop operation");
		driver.close();
	}
}
