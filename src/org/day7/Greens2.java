package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens2 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		
		TakesScreenshot tk =(TakesScreenshot) driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\screenshot\\address.png");
		
		FileUtils.copyFile(src,des);		
	}
}
