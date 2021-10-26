package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		

		WebElement phone = driver.findElement(By.xpath("(//span[contains(text(),'Ap')])[1]"));
		
		a.moveToElement(phone).contextClick().perform();
		
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.switchTo().frame(1);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String eachid : allwindow) {
			
			if (!parent.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}
		Thread.sleep(2000);
		WebElement value = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		
		String text = value.getText();
		System.out.println(text);
		
		
		
		
		
			
		
			
	}
}
