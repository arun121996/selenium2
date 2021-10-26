package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size = rows.size();
		System.out.println(size);
		System.out.println("done");
		
	}
}
