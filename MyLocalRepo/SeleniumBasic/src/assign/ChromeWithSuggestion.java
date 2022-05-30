package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithSuggestion {

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Validate Actual Url:"+ActualUrl);
		String ExpectedUrl="https://www.google.com/";
		driver.manage().window().maximize();
		System.out.println("Validate ExpectedUrl:"+ExpectedUrl);
		if(ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Home Page Validate Sucessfully");
		}else {
			System.out.println("Home Page not Validate Sucessfully");
		}
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Selenium");
		Thread.sleep(500);
		List<WebElement>g1=driver.findElements(By.cssSelector("ul.G43f7e>li"));
		System.out.println("Size:"+g1.size());
		for(WebElement SearchList: g1) {
			System.out.println(SearchList.getText());
		}
		driver.close();
	}

}
