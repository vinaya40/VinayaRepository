package com.filpkart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class test4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		EventFiringWebDriver edriver=new  EventFiringWebDriver(driver);
		File srcfile=edriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("d:/google.png"));
		driver.close();
		//pass
		}

}
