package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver","C:\\Users\\Welcome\\eclipse-workspace\\JavaProject\\Library\\selenium-server-4.25.0.jar");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement name = driver.findElement(By.name("email"));
		name.sendKeys("Dora");
		
		WebElement user = driver.findElement(By.id("pass"));
		user.sendKeys("123456");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		login.clear();
		
		
		
		
	}
}