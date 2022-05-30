package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class JS1 extends SeleniumUtility {
	@Test
	public void testLoginWithoutClick() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		// Creating reference variable of JavascriptExecutor by casting from WebDriver
		// interface
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// driver.findElement(By.id("username")).sendKeys("admin");
		js.executeScript("document.getElementById('username').value='admin';");

		driver.findElement(By.name("pwd")).sendKeys("manager");
		//js.executeScript("document.getElementByName('pwd').value='manager';");

		 // driver.findElement(By.id("loginButton")).click(); //0-30
		js.executeScript("document.getElementById('loginButton').click();");
		// or
		// js.executeScript("document[0].click();");
		
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
//		waitForElementToBeClickable(logoutLink);
		
		//js.executeScript("document.getElementById('logoutLink').click();");
		// or
		 js.executeScript("document[0].click();", logoutLink );
		
		driver.close();
	}
}
