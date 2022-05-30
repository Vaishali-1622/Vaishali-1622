package assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithFlipcart {

	public static void main(String[] args) throws InterruptedException {
		//path setup
		String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//instance created
		WebDriver driver = new ChromeDriver();
		//calling url
		driver.get("https://www.flipkart.com/");
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(500);
		//printing Actual url
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Validate Home Page:"+ActualUrl);
		String ExpectedUrl="https://www.flipkart.com/";
		System.out.println("Validate ExpectedUrl:"+ExpectedUrl);
		if(ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Home Page Validate Sucessfully");
		}else {
			System.out.println("Home Page not Validate Sucessfully");
		}
		//closing pop up
		driver.findElement(By.cssSelector("div>div>button")).click();
		List<WebElement>d1 =driver.findElements(By.cssSelector("div.InyRMC._3Il5oO>div>div"));
		System.out.println("Size is:"+d1.size());
		for(WebElement Menu:d1) {
			System.out.print("Menu Printing:"+Menu.getText());
		}
		driver.close();
	}

}
