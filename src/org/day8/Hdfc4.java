package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	
	driver.switchTo().frame("login_page");
	
	
	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	Thread.sleep(2000);
	
	Alert a = driver.switchTo().alert();
	a.accept();

  }
}
