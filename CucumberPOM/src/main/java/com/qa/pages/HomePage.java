package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement newCustomerlink;
	
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	WebElement editCustomerlink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public NewCustomer clickOnNewCustomer()
	{
		newCustomerlink.click();
		return new NewCustomer();
		
	}
	
}
