package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
        WebElement scroll = driver.findElement(By.xpath("//div[@id='heading302']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(scroll).click().perform();
		
		WebElement day1= driver.findElement(By.xpath("//a[text()=' Day1_Class-Method-Object']"));
		
		a.moveToElement(day1).click().perform();
		
		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String eachid : allwindow) {
			if (!parent.equals(allwindow)) {
				System.out.println(eachid);
			}
		}
		}
}
