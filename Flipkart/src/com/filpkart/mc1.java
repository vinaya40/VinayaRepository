package com.filpkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mc1 {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.moneycontrol.com/");
	driver.findElement(By.xpath("//a[@title='Log In']")).click();
	driver.switchTo().frame(0);
	

}
}