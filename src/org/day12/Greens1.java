package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens1 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		WebElement line1 = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", line1);
		
		
		
	WebElement line2 = driver.findElement(By.xpath("//strong[contains(text(),'149, 1C/1D, 1s')]"));
		
		WebElement address = driver.findElement(By.tagName("strong"));
		
		Actions a = new Actions(driver);
		
		String text = address.getText();
		
		System.out.println(text);
		System.out.println(line2.getText());
		
	
	}
}
