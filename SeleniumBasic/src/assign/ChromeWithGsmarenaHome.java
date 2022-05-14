package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithGsmarenaHome {

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
		//finding child by three types
		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li:first-child")).click();
		Thread.sleep(2000);
		//		driver.navigate().back();
//		Thread.sleep(500);
//		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li:last-child")).click();
//		driver.navigate().back();
//		Thread.sleep(500);
//		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li:nth-of-type(12)")).click();
//		driver.navigate().back();
//		Thread.sleep(500);
//		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li:nth-of-type(16)")).click();
//		driver.navigate().back();
//		Thread.sleep(500);
		List<WebElement>v1=driver.findElements(By.cssSelector("div.section-body>div>ul>li>a"));
		System.out.println("Size count:"+v1.size());
		for(WebElement List:v1) {
			System.out.println("List of Mobiles are:"+List.getText());
		}
		driver.navigate().back();
		Thread.sleep(500);
		driver.close();
	}

}
