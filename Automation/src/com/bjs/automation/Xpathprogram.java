package com.bjs.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprogram {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/homepage");
		WebElement username = driver.findElement(By.xpath("//input[@id=\"usernameField\"]"));
		username.sendKeys("enikkomartin21@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id=\"passwordField\"]"));
		password.sendKeys("enikko0enikko0");
		WebElement login = driver.findElement(By.xpath(
				"//button[@class=\"waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform\"]"));
		login.click();

	}

}
