package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement scroll = driver.findElement(By.xpath("//div[@id='heading303']"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(scroll).click().perform();
		
		WebElement task = driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']"));
		a.moveToElement(task).click().perform();
		
		String parent = driver.getWindowHandle();
		
		Set<String> allwindow = driver.getWindowHandles();
		for (String eachid : allwindow) {
			if (!eachid.equals(allwindow)) {
				System.out.println(eachid);
			}
			
		}
		
		
	}
}
	
