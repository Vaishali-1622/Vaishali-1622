package webpagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;
import webpages.ActiTimeHome;
import webpages.ActiTimeLogin;

public class ActiTimeHomeScript extends SeleniumUtility{
	WebDriver driver;
	ActiTimeHome getActiTimeHome;
	ActiTimeLogin getActiTimeLogin;
	@BeforeTest
	public void openBrowser() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		getActiTimeHome = new ActiTimeHome(driver);
		getActiTimeLogin =new ActiTimeLogin(driver);
	}

	@BeforeMethod
	public void loginTest() {
		getActiTimeLogin.loginTime("admin", "manager");

	}
	
	@Test
	public void ActiTimeHomePage() {
		getActiTimeHome.clickOnTask();
		
	}

//	@AfterMethod
//	public void closeBrowser() {
//		cleanUp();
//	}

}
