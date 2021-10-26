package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("(//div[contains(text(),'acer Asp')])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(clk).click().build().perform();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String eachid : allwindow) {
			if (!parent.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}
		WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		
		Actions txt = a.moveToElement(price);
		String text = price.getText();
		System.out.println(text);
		
	}
}
