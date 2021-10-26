package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		WebElement s = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		
		s.click();
		
		
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		
		
		a.sendKeys("hello");
		System.out.println(a.getText());
		a.accept();
	}
}
