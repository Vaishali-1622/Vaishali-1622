package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");		
	
		//to open alert popup
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		//switch your control to alert popup
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert Popup text: "+alertText);
		//to accept alert or to click on ok or yes button use
		driver.switchTo().alert().accept();
		
		
//				//to open confirmation popup
//				driver.findElement(By.id("confirmButton")).click();
//				//switch your control to confirmation popup
//				String confirmationPopupText=driver.switchTo().alert().getText();
//				System.out.println("confirmation Popup text: "+confirmationPopupText);
//				//to accept alert or to click on ok or yes button use
//				driver.switchTo().alert().accept();
//				//to click on cancel or no button
//				//driver.switchTo().alert().dismiss();
		
//		//to open prompt popup
//		driver.findElement(By.id("promtButton")).click();
//		//switch your control to prompt popup
////		String promptPopupText=driver.switchTo().alert().getText();
////		System.out.println("prompt Popup text: "+promptPopupText);
//				//or
//		System.out.println(driver.switchTo().alert().getText());
//		//type text in popup
//		driver.switchTo().alert().sendKeys("Selenium Testing");
//		//to accept alert or to click on ok or yes button use
//		//driver.switchTo().alert().accept();
//		//to click on cancel or no button
//		driver.switchTo().alert().dismiss();
		
	}
	
	}


