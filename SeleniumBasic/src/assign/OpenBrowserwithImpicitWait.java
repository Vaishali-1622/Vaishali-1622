package assign;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowserwithImpicitWait {

	

	private static By logoutLink;
	private static By login;

	public static void main(String[] args) throws InterruptedException {
		//creating path
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		//calling path
		System.setProperty("webdriver.chrome.driver", path);
		//create instance of driver class
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// set window size based on our requirement
		//driver.manage().window().setSize(new Dimension(500, 700));
		//Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String Title = driver.getTitle();
		System.out.println("Actual Title:" + Title);
		String ExpectedTitle="actilogin";
		System.out.println("Expected Title is:"+ExpectedTitle);
		if (ExpectedTitle.equals(Title)) {
			System.out.println("Both the Title are  are same");
		} else {
			System.out.println("Both the Title are not same");
		}
		
		//identify the required element from the UI and perform required action 0-10
		WebElement usernameinput = driver.findElement(By.id("username"));
		usernameinput.sendKeys("admin");
		//identify the required element from the UI and perform required action 0-10
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("#loginButton > div")).click();
		//Navigation in browser
				Thread.sleep(2000);
				//go to previous page
				driver.navigate().back();
				Thread.sleep(2000);
				// next page
				driver.navigate().forward();
				Thread.sleep(2000);
				//reload or refresh current page
				driver.navigate().refresh();
				Thread.sleep(2000);
				//jump from current page to another page or URL
				//driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#logoutLink")).click(); //0-10
		//driver.quit();
		// driver.close();
	}
}
