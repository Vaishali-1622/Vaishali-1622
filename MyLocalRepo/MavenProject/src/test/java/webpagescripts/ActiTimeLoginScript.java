package webpagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;
import junit.framework.Assert;
import webpages.ActiTimeLogin;

public class ActiTimeLoginScript extends SeleniumUtility {
	WebDriver driver;
	ActiTimeLogin getActiTimeLogin;

	@BeforeTest
	public void openBrowser() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		getActiTimeLogin = new ActiTimeLogin(driver);
	}

	@Test
	public void loginTest() {
		getActiTimeLogin.loginTime("admin", "manager");
		String actualTitle = getActiTimeLogin.getCurrentTitleOfApplication();
		String expectedTitle = "actiTIME - Login";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterTest
	public void closeBrowser() {
		cleanUp();
	}

}
