package com.filpkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActi {
	System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("htttp://www.actimind.com/");

}
