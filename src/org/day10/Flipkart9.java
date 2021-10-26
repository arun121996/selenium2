package org.day10;

import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
//		driver.switchTo().frame(1);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> first = driver.getWindowHandles();
		for (String eachid : first) {
			if (!parent.equals(eachid)) {
				System.out.println(eachid);
			}
		}
		Thread.sleep(5000);
		WebElement print = driver.findElement(By.xpath("//div[@class='_25b18c']"));
		Actions a = new Actions(driver);
		Actions move = a.moveToElement(print);
		String text = print.getText();
		System.out.println(text);
		

		
			
		
	}
}
