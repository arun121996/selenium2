package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphone 7 phone");
		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		clk.click();
		
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		first.sendKeys("600059");
		
		WebElement second = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		second.click();
		
		Thread.sleep(2000);
		WebElement third = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		
		third.click();
		
		driver.findElements(By.xpath("//span[text()='add to cart']"));
		
        driver.switchTo().frame(1);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String eachid : allwindow) {
			
			if (!parent.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}

		WebElement print = driver.findElement(By.xpath("//span[text()='add to cart']"));
		print.click();
		
		WebElement find = driver.findElement(By.xpath("//span[@class='price']"));
		Actions a = new Actions(driver);
		Actions price = a.moveToElement(find);
		String text = find.getText();
		System.out.println(text);
	}
}
