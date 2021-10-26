package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal8 {
	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("handsanitizer");
		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		clk.click();
        Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
		first.sendKeys("600059");
		
		WebElement second = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		second.click();
		Thread.sleep(2000);
		
		WebElement buttonclk = driver.findElement(By.xpath("(//p[contains(text(),'VRH')])[1]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(buttonclk).click().perform();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		
		Set<String> allwindows = driver.getWindowHandles();
		for (String eachid : allwindows) {
			if (!parent.equals(eachid)) {
				System.out.println(eachid);
			}
		}
		Thread.sleep(2000);
		WebElement cardclk = driver.findElement(By.xpath("(//div[@supc='SDL153373010'])[2]"));
		a.moveToElement(cardclk).click().perform();
	}
}
