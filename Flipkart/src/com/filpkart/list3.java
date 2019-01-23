package com.filpkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class list3 {
	public static void main(String[] args) throws InterruptedException {
	/*
	 *  to handle dynamiclistbox(thelistbox whose content keep changing during runtime)
	 *  in order to handle them we use select class itself along with explicitwait
	 */
		
	System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.plus2net.com/php-tutorial/ajx-dd3.php");
	WebElement clistbox=driver.findElement(By.id("s1"));
	Select cSelect=new Select(clistbox);
	cSelect.selectByVisibleText("IND");
	WebElement slistbox=driver.findElement(By.name("State"));
	Select sSelect=new Select(slistbox);
	//wait till Gujarat is loaded upto 15 seconds
	WebDriverWait wait=new WebDriverWait(driver,15);
	By b=By.xpath("//option[@value='Gujarat]");
	wait.until(ExpectedConditions.elementToBeClickable(b));
	sSelect.selectByVisibleText("Gujarat");
	}
}
