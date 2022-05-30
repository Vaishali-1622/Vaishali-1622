package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingActiveElement {

	public static void main(String[] args) {
//		SeleniumUtility s1=new SeleniumUtility();
//		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		//validate by default cursor is pointing to username input field
		WebElement activeObject=driver.switchTo().activeElement();
		
		String activeObjectPlaceholder=activeObject.getAttribute("placeholder");
		String expectedActiveObject="Username";
		if (activeObjectPlaceholder.equals(expectedActiveObject)) {
			System.out.println("curson pointer validation is sucessful");
		}else {
			System.out.println("curson pointer validation is unsucessful");
		}
		//login in actitime application without identifying any object
		activeObject.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
