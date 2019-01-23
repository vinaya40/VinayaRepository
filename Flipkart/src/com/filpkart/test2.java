package com.filpkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		//the list of options displayed when u right click on web page is called as context menu
		//in order to right click on the web page v use context click method of actions class
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("htttp://www.actimind.com/");
		String xp1="//span[text()='Home Page']";
		WebElement home=driver.findElement(By.xpath(xp1));
		
		Actions action=new Actions(driver);
		action.contextClick(home).perform();
		action.sendKeys("w").perform();
	}

}
