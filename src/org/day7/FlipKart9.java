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

public class FlipKart9 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone11");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		TakesScreenshot ts = (TakesScreenshot)  driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\screenshot\\iphone.jpg");
		
		FileUtils.copyFile(src, des);
		
	}
}
