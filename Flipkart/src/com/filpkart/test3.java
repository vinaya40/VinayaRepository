package com.filpkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test3 {
	public static void main(String[] args) throws InterruptedException {
		//the list of options displayed when u right click on web page is called as context menu
		//in order to right click on the web page v use context click method of actions class
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String url="http://www.dhtmalgoodies.com/submitted-scipts/i-gooogle-line-drag-drop/";
		driver.get(url);
		String xp11="//h1[text()='Block1']";
		WebElement b1=driver.findElement(By.xpath(xp11));
		String xp12="//h1[text()='Block3']";
		WebElement b2=driver.findElement(By.xpath(xp11));
		Actions action=new Actions(driver);
		action.dragAndDrop(b1, b2).perform();
		
	}}
