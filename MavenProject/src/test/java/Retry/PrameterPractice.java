package Retry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;


public class PrameterPractice extends SeleniumUtility {
  @Parameters({"Browser"})
  @Test(priority=1)
  public void Browser(String Browser) {
	  System.out.println("Browser Name:"+Browser);
  }
  @Parameters({"UserName","Password"})
  @Test(priority=2)
  public void Credential(String UserName, String Password) {
	  System.out.println("User Name:"+UserName);
	  System.out.println("Password Name:"+Password);

  }
  
  @Parameters({"Browser","UserName","Password"})
  @Test(priority=3)
  public void Login(String Browser,String UserName, String Password) {
	  System.out.println("Browser Name:"+Browser);
	  System.out.println("User Name:"+UserName);
	  System.out.println("Password Name:"+Password);

  }
  @Parameters({"Browser","UserName","Password" })
	@Test(priority=4, retryAnalyzer = Retry.RetryTestAnalyzer.class)
	public void testLoginOfVtiger(String Browser,String UserName, String Password) {
		setUp(Browser, "https://demo.vtiger.com/vtigercrm/index.php");
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("userName")).sendKeys(UserName);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(Password,Keys.ENTER);
			cleanUp();
	}
  
}
