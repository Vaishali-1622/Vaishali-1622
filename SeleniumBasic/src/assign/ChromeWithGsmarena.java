package assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithGsmarena {

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Validate Actual Url:"+ActualUrl);
		String ExpectedUrl="https://www.gsmarena.com/";
		driver.manage().window().maximize();
		System.out.println("Validate ExpectedUrl:"+ExpectedUrl);
		if(ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Home Page Validate Sucessfully");
		}else {
			System.out.println("Home Page not Validate Sucessfully");
		}
		List<WebElement>c1=driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		System.out.println("Size is:"+c1.size());
		for(WebElement MobileList: c1) {
			System.out.println("List of mobiles are:"+MobileList.getText());
		}
		
		driver.close();
	}

}
