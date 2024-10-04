package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
System.setProperty("WebDriver.ChromeDriver","C:\\Users\\Welcome\\eclipse-workspace\\JavaProject\\Library\\selenium-server-4.25.0.jar");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement user = driver.findElement(By.id("twotabsearchtextbox"));
		user.click();
		
		WebElement element = driver.findElement(By.name("field-keywords"));
		element.sendKeys("iphone 14");
		
		WebElement newuser = driver.findElement(By.id("nav-search-submit-button"));
		newuser.click();
		
		
		
	}

}
