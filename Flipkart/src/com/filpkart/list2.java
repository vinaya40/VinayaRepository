package com.filpkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class list2 {

	public static void main(String[] args) {
		//Handlying the listbox(dropdownbox)
		//thelisbox content is keep changing during runtime is called is called dynamic listbox
		//in order to handle v use select class itself along with explicit wait.
		//Note:Most of the cases dynamic elements are developed using AJAX[Asyncronous Java script and XML technolgy
		//to hadle Ajax elements v use explict wait
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.fatcow.com/");
		WebElement listbox=driver.findElement(By.id("countrySelect "));
		Select select=new Select(listbox);
		select.selectByVisibleText("Australia");
		select.selectByIndex(0);
		select.selectByValue("CAD");
		//to count the number of options present in listbox
		List<WebElement> alloptions=select.getOptions();
		int OptionCount=alloptions.size();
		System.out.println(OptionCount);
		System.out.println(select.getOptions().size());
		//to print all the options present in listbox
		for(int	i=0;i<alloptions.size();i++	)
		{
			String name=alloptions.get(i).getText();
			System.out.println(name);
		}
	
		
		
	}

}
