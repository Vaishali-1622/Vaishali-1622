package webpagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;
import webpages.OrangeHRMLoginPage;
import junit.framework.Assert;

public class OrangeHRMLoginScript extends SeleniumUtility{

	@Test
	public void loginIntoOrangeHRMApp() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		OrangeHRMLoginPage getOrangeHRMLoginPage=new OrangeHRMLoginPage(driver);
		
		getOrangeHRMLoginPage.loginIntoOrangeHRM("Admin", "admin123");
		Assert.assertEquals("Dashboard",getOrangeHRMLoginPage.getHomePageTitle());
	}
}
