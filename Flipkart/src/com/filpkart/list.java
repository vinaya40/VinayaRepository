package com.filpkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class list {
	public static void main(String[] args) throws InterruptedException {

		// to run script in chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.seleniumhq.org/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		// it will print the web page title
		/*
		 * if(title.equals("docs.seleniumhq")) {System.out.println("Pass");} else
		 * {System.out.println("Fail");}
		 */
		
		
		String title2 = driver.getWindowHandle();
		System.out.println(title2);
		// it will print the webbrowser's alpha numeric string
		
		Set<String> a = driver.getWindowHandles();
		System.out.println(a.size());
		// it ll print count of the browsers opened
		
		
		driver.get("http://www.naukri.com/");
		Set<String> b = driver.getWindowHandles();
		Iterator<String> c=b.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		//Pass
			
		//to print the window handle of all the browsers opened by selenium
		
		//Handlying the listbox(dropdownbox)
		
		
		
		/*
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh(); driver.close();
		 */
		/*
		 * driver.get("https://www.google.com/"); String title=driver.getTitle();
		 * if(title.equals("Google")) {System.out.println("Pass");} else
		 * {System.out.println("Fail");
		 */
		// String title=driver.getWindowHandle();
	}

}
