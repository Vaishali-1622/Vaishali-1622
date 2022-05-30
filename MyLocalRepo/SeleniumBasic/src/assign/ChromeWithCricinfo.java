package assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithCricinfo {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Validate Actual Url:"+ActualUrl);
		String ExpectedUrl="https://www.espncricinfo.com/";
		driver.manage().window().maximize();
		System.out.println("Validate ExpectedUrl:"+ExpectedUrl);
		if(ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Home Page Validate Sucessfully");
		}else {
			System.out.println("Home Page not Validate Sucessfully");
		}
		List<WebElement>f1=driver.findElements(By.cssSelector("div.ds-flex.ds-flex-row>div>a"));
		System.out.println("Size is:"+f1.size());
		for(WebElement Menu: f1) {
			System.out.println("Menu Printing:"+Menu.getText());
		}
		driver.close();
	}

}
