package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;


public class SaucePractice extends SeleniumUtility {
 @Parameters ({"Browser"})
  @Test
  public void Testcase1(String Browser) {
	 System.out.println("Browser Name:"+Browser);
  }
 @Parameters ({"UserName","Password"})
  @Test
  public void Testcase2(String UserName, String Password) {
	 System.out.println("User Name:"+UserName);
	 System.out.println("Password Name:"+Password);
  
  }
 @Parameters ({"Browser","UserName","Password"})
  @Test
  public void Testcase3(String Browser, String UserName, String Password) {
	 System.out.println("Browser Name:"+Browser);
	 System.out.println("User Name:"+UserName);
	 System.out.println("Password Name:"+Password);
  }
 @Parameters ({"Browser","UserName","Password"})
 @Test
 public void saucedemo(String Browser, String UserName, String Password) {
	 	setUp(Browser,"https://www.saucedemo.com/");
	 	driver.findElement(By.id("user-name")).sendKeys(UserName);
	 	driver.findElement(By.id("password")).sendKeys(Password,Keys.ENTER); 
	    cleanUp();
 }
}
