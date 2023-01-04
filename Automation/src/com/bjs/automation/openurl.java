package com.bjs.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class openurl {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		// String curl = driver.getCurrentUrl();
		// System.out.println(curl);
		// String ctitle = driver.getTitle();
		// System.out.println(ctitle);
		String etitle = "Job - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		String ctitle = driver.getTitle();

		if (etitle.equalsIgnoreCase(ctitle)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
	}

}
