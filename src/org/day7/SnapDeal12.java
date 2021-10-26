package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal12 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("keyword")).sendKeys("hp laptop");
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		 
		Thread.sleep(2000);
		WebElement txtpin = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		txtpin.sendKeys("621710");
		
		WebElement txtclk = driver.findElement(By.xpath("//button[text()='Check']"));
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\screenshot\\hp.jpg");
		
		FileUtils.copyFile(src, des);
	}
}
