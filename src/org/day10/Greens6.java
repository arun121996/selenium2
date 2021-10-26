package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement scroll = driver.findElement(By.xpath("//div[@id='heading304']"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(scroll).click().perform();
		
		WebElement junit = driver.findElement(By.xpath("//a[text()=' JUNIT']"));
		a.moveToElement(junit).click().perform();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		
		for (String eachid : allwindows) {
			if (!parent.equals(allwindows)) {
				System.out.println(eachid);
			}
		}
		
		
	}
}
