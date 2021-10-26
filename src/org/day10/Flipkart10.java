package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mask");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("//a[text()='BILDOS 3 Layer Pure Cotton Cloth Mask with Adjustable E...']"));
		clk.click();
		
//		driver.switchTo().frame(1);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		for (String eachid : allwindow) {
			if (!parent.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("621710");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		
		
	}
	
}
