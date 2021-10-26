package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("username"));
		
		WebElement txtpass = driver.findElement(By.id("password"));
		
		WebElement enter = driver.findElement(By.id("login"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','arun')", txtuser);
		
		js.executeScript("arguments[0].setAttribute('Value','12345')", txtpass);
		
		js.executeScript("arguments[0].click()", enter);
	}
}
