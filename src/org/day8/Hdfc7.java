package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	driver.switchTo().frame("login_page");
	
	driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("123456");
	
	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	
   }
}
