package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
//import junit.framework.Assert;

public class HomePageSteps extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	
		TestBase.initialization();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage = new LoginPage();
		String title = loginpage.loginPageTitle();
		System.out.println("Title is "+ title);
	   Assert.assertEquals("Guru99 Bank Home Page", title);
	}

	@Then("^user logging into system$")
	public void user_enter_username_and_password()  {
		
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}

	

	@Then("^validate homepage title$")
	public void validate_homepage_title() throws Throwable {
		String homepagetitle = homepage.verifyHomePageTitle();
		System.out.println("Title is "+ homepagetitle);
		Assert.assertEquals("Guru99 Bank Manager HomePage", homepagetitle);
		
		Thread.sleep(10000);
		driver.quit();
	}


}
