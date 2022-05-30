package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) throws InterruptedException {
		
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		// Set Property
		System.setProperty("webdriver.chrome.driver", path);
		// instance of Driver Class
		WebDriver driver = new ChromeDriver();
		// get URl
		driver.get("https://www.techlistic.com/");
		// set window size based on our requirement
		driver.manage().window().setSize(new Dimension(300, 500));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#PageList2 > div > div.overflowable-container.overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(1) > a")).click();
		// Get Title
				String Title = driver.getTitle();
				// calling Title Name
				System.out.println("Actual tital : " + Title);
				driver.navigate().back();
				Thread.sleep(1000);
		driver.findElement(By.cssSelector("#PageList2 > div > div.overflowable-container.overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(2) > div > a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		// Get Title
		String Title1 = driver.getTitle();
		// calling Title Name
		System.out.println("Actual tital : " + Title1);
		driver.findElement(By.cssSelector("#PageList2 > div > div.overflowable-container.overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(7) > div > a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#PageList2 > div > div.overflowable-container.overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(9) > div > a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		// Get Title
		String Title2 = driver.getTitle();
		// calling Title Name
		System.out.println("Actual tital : " + Title2);
		
		driver.close();

	}

}
