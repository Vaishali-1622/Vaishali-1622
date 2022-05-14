package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserwithLocater {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		String Title = driver.getTitle();
		System.out.println("Actual Title:" + Title);
		System.out.println("Title Length:" + Title.length());
		String ExpectedUrl = "demosite.executeautomation.com";
		System.out.println("Expected Url:" + ExpectedUrl);
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Actual Url:" + ActualUrl);
		if (ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Both the Url are same");
		} else {
			System.out.println("Both the Url are not same");
		}
		WebElement usernameinput = driver.findElement(By.name("UserName"));
		usernameinput.sendKeys("execution");
		WebElement passwordnameinput = driver.findElement(By.name("Password"));
		passwordnameinput.sendKeys("admin");
		WebElement logininput = driver.findElement(By.xpath("//*[@id=\"userName\"]/p[3]/input"));
		logininput.click();
		String EnterUrl = driver.getCurrentUrl();
		System.out.println("Actual Url is:" + EnterUrl);
		// WebElement
		// logoutinput=driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a/span"));
		// logoutinput.click();
		// driver.close();
	}

}
