package com.filpkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list4 {

	public static void main(String[] args) {
		////listbox developed without using html tag is called custamised listbox>>
		//if v use selct class we get 'unexpectedTagNameException
		//in order to handle v use sendkeys method itself 
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.yatra.com");
		WebElement listBox=driver.findElement(By.id("BE-flight-origin-city"));
		listBox.sendKeys("bangalore");
		listBox.sendKeys(Keys.ENTER);

	}

}
