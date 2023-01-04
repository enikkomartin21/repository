package com.bjs.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third {

	public static void main(String[] args) {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\martinj4\\OneDrive - moodys.com\\Desktop\\selenium software\\chromedriver_win32 (1)\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		// WebDriver driver=new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();

		// Launch Website
		driver.navigate().to("http://www.javatpoint.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Scroll down the webpage by 5000 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");

		// Click on the Search button
		driver.findElement(By.linkText("Core Java")).click();

	}

}
