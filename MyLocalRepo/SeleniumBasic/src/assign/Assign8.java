package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> cric = driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div"));
		System.out.println("Size is:" + cric.size());
		for (WebElement List : cric) {
			System.out.println("List of menu are:" + List.getText());
		}
		// mouse hover
		Actions act = new Actions(driver);
		for (int i = 0; i < cric.size(); i++) {
			WebElement hover = cric.get(i);
			act.moveToElement(hover).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(
					"div[class='wzrk-alert wiz-show-animate']>div[class='wzrk-button-container']>button[id='wzrk-cancel']"))
					.click();

			// driver.close();
		}
	}

}
