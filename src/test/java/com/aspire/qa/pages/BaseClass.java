package com.aspire.qa.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aspire.qa.utility.BrowserFactory;
import com.aspire.qa.utility.ConfigDataProvider;
import com.aspire.qa.utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		config=new ConfigDataProvider(); 
	}
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getURL());
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver);
		}
		
	}

}
