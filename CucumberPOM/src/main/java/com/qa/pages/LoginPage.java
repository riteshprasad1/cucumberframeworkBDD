package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.crm.qa.pages.HomePage;
import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	//WebDriver ldriver;

	public LoginPage()
	{
		//ldriver = rdriver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name="uid")
	@CacheLookup
	WebElement username;

	@FindBy(name="password")
	@CacheLookup
	WebElement password;

	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;

	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		btnLogin.click();
		return new HomePage();
	}
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
				
				

}
