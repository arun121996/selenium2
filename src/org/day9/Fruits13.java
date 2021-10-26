package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fruits13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUNKUMAR\\eclipse-workspace\\SeleniumData1\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		
		Select s = new Select(dropdown);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByValue("orange");
		s.selectByVisibleText("Apple");
		s.selectByIndex(3);
		
		List<WebElement> li = s.getAllSelectedOptions();
		for (int i = 0; i < li.size(); i++) {
			WebElement each = li.get(i);
			String text = each.getText();
			System.out.println(text);
			
		}
		List<WebElement> li1 = s.getOptions();
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li1.get(i).getText());
		}
	}
}
