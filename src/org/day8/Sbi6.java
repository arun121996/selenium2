package org.day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
}
}
