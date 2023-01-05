package seleniumframework2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyworddriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis	= new FileInputStream ("C:\\Users\\martinj4\\eclipse-workspace\\seleniumframework2\\src\\utility2\\testdata2.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		String submit = p.getProperty("submit");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(submit);
		
		ChromeDriver driver	= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/homepage");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(username)).sendKeys("enikkomartin21@gmail.com");
		driver.findElement(By.xpath(password)).sendKeys("enikko0enikko0");
		driver.findElement(By.xpath(submit)).click();
		
	}

}
