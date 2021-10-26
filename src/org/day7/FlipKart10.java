package org.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart10 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement txtfashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(txtfashion).perform();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\screenshot\\flipkart10.jpg");
		FileUtils.copyFile(src,des);
	}

	

	
//	File src = ts.getScreenshotAs(OutputType.FILE);
//	
//	File des = new File("C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\screenshot\\flipkart10.jpg");
//	
//	FileUtils.copyFile(src,des);
}
