package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		WebElement txtpass = driver.findElement(By.id("pass"));
	    WebElement btnlogin = driver.findElement(By.name("login"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('Value','Greens')", txtuser);
		
		
		js.executeScript("arguments[0].setAttribute('Value','12345')", txtpass);
		
		
		Object o = js.executeScript("return arguments[0].setAttribute('Value','Greens')", txtuser);
		
		String s = (String) o;
		System.out.println(s);
		
		Object o2 = js.executeScript("return arguments[0].setAttribute('Value','12345')", txtpass);
		String s1 =(String) o2;
		System.out.println(s1);
		

		js.executeScript("arguments[0].click()", btnlogin);
		
	}
}
