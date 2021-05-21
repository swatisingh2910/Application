package com.aspire.qa.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	
	public static WebDriver startApplication(WebDriver driver, String browsername, String appURL) 
	{
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			
		}
		else if(browsername.equals("IE"))
		{
			
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static void quitBrowser(WebDriver driver) 
	{
		driver.quit();
		
	}

}
