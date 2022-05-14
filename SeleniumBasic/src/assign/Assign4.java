package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

	public static void main(String[] args) throws InterruptedException {
		// path setup
		// String path1 = "F:\Acceleration\Automation
		// Testing\Workspace\SeleniumBasic\executable\chromedriver.exe";
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		// Set Property
		System.setProperty("webdriver.chrome.driver", path);
		// instance of Driver Class
		WebDriver driver = new ChromeDriver();
		// get URl
		driver.get("https://www.amazon.in/");
		// set window size based on our requirement
		driver.manage().window().setSize(new Dimension(300, 500));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// Get Title
		String Title = driver.getTitle();
		// calling Title Name
		System.out.println("Actual tital : " + Title);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#nav-hamburger-menu > i")).click();
		driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(24) > a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		// Get Title
		String Title1 = driver.getTitle();
		// calling Title Name
		System.out.println("Actual tital : " + Title1);
		// Get Title
		String Title2 = driver.getTitle();
		// calling Title Name
		System.out.println("Actual tital : " + Title2);
		if (Title2.equals(Title)) {
			System.out.println("Both the Title are same");
		} else {
			System.out.println("Both the Title are not same");
		}
		driver.findElement(By.cssSelector("#nav-hamburger-menu > i")).click();
		driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(2) > a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();

	}

}
