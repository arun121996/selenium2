package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			
			
			List<WebElement> data = driver.findElements(By.tagName("td"));
			
			for (int j = 0; j <data.size(); j++) {
				WebElement datas = data.get(j);
				String text = datas.getText();
				System.out.println(text);
//				if (text.endsWith("fourth cell")) {
//					System.out.println(text);
//				}
			}
		}
		
		
		
	}
}
