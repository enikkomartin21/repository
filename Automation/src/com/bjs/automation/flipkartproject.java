package com.bjs.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartproject {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement Search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Search.sendKeys("redmi mobile");
		WebElement login = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		login.click();

	}

}
