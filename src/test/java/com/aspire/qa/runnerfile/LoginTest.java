package com.aspire.qa.runnerfile;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aspire.qa.pages.BaseClass;
import com.aspire.qa.pages.LoginPage;
import com.aspire.qa.utility.ExcelDataProvider;
import com.aspire.qa.utility.Helper;
//import com.aspire.qa.utility.BrowserFactory;

public class LoginTest extends BaseClass{
	
	@Test
	public void LoginApp()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		
		excel.getStringData("Login", 0, 0);
		//driver=BrowserFactory.startApplication(driver, "Chrome", "https://feature-culturefit.development.hirelogic.com/signin");
		
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		
		loginpage.loginToSite(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		//BrowserFactory.quitBrowser(driver);
		//Helper.captureScreenshot(driver);
	}
	
	
	
}
