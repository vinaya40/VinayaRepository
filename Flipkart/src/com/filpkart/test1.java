package com.filpkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test1 {
	public static void main(String[] args) 
	{
		//Dropdown menu:it is element on which we move pointer it will display list of options
		//in order to handle dropdownmenu v use Action class
		//in order to move the moouse ponter on the element v use moveTo element method of Action class but when ever v
		//call that menthod v should call perform method
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("htttp://www.actimind.com/");
		String xp="/span[text()='About Company']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		
		
		

}
}