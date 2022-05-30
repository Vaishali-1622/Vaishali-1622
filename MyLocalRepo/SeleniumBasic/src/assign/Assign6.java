package assign;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign6 {

	private static Object allSuggestions;

	public static void main(String[] args) throws InterruptedException {
		// path setup
				String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
				// Set Property
				System.setProperty("webdriver.chrome.driver",path);
				// instance of Driver Class
				WebDriver driver = new ChromeDriver();
				// get URl
				driver.get("https://www.google.com/");
				
				// Get TItal
				String Tital = driver.getTitle();
				// calling TITal Name
				System.out.println("Actual tital : "+Tital);
				// calling TItal Length
				System.out.println("get tital length : "+Tital.length());
				WebElement query = driver.findElement(By.name("q"));
				query.sendKeys("Cheese paratha");
				Thread.sleep(1000);		
				WebDriverWait wait = new WebDriverWait(driver, 5);
			    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")));
			    query.submit();
			    List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
			    System.out.println(allSuggestions.size());
			    for (WebElement suggestion : allSuggestions) {

			    System.out.println("Conole Prints as:"+suggestion.getText());

			    }
				driver.close();
	}

}
