package com.aspire.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) 
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement userID;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement userPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement btnLogin;
	
	
	public void loginToSite(String userId,String password) {
		userID.sendKeys(userId);
		userPassword.sendKeys(password);
		btnLogin.click();
	} 

}
