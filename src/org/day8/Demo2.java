package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirm.click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		Thread.sleep(3000);
		a.accept();
		
	}
}
