package org.day11;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		
//		List<WebElement> rows = driver.findElements(By.tagName("tr"));
//		
//		for (int i = 0; i < rows.size(); i++) {
//			WebElement row =rows.get(i);
//			String text = row.getText();
//			System.out.println(text);
//			
		
		
		    List<WebElement> datas = driver.findElements(By.tagName("td"));
			
			for (int j = 0; j < datas.size(); j++) {
				WebElement data = datas.get(j);
				String text1 = data.getText();
				System.out.println(text1);
		
			}
			
//		}
		
		
	}
}
