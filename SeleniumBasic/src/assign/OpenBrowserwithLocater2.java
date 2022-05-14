package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserwithLocater2 {

	public static void main(String[] args) {
		//creating path
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		//calling path
		System.setProperty("webdriver.chrome.driver", path);
		//create instance of driver class
		WebDriver driver = new ChromeDriver();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		String Title = driver.getTitle();
		System.out.println("Actual Title:" + Title);
		System.out.println("Title Length:" + Title.length());
		String ExpectedUrl = "https://crmaccess.vtiger.com/log-in/";
		System.out.println("Expected Url:" + ExpectedUrl);
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Actual Url:" + ActualUrl);
		if (ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Both the Url are same");
		} else {
			System.out.println("Both the Url are not same");
		}
		WebElement usernameinput = driver.findElement(By.name("username"));
		usernameinput.sendKeys("admin");
		
		WebElement passwordnameinput = driver.findElement(By.name("password"));
		passwordnameinput.sendKeys("Text@123");
		WebElement Signininput = driver.findElement(By.xpath("//*[@id=\"com-form-login\"]/div[3]/button"));
		Signininput.click();
		// driver.close();
	}
}
