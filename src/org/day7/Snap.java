package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		TakesScreenshot tk =(TakesScreenshot)driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		
	    File  desFile = new File("C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\screenshot\\greenstechnogy.png");
	    
	    FileUtils.copyFile(srcFile, desFile);
	    
	}
}
 