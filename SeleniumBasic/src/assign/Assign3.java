package assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		// path setup
				//String path1 = "F:\Acceleration\Automation Testing\Workspace\SeleniumBasic\executable\chromedriver.exe";
				String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
				// Set Property
				System.setProperty("webdriver.chrome.driver",path);
				// instance of Driver Class
				WebDriver driver = new ChromeDriver();
				// get URl
				driver.get("https://demo.actitime.com/");
				// Expected URl
				String ExpectedURL = "https://demo.actitime.com/login.do";
				// calling expected URL
				System.out.println("Expected URl is "+ExpectedURL);
				// current URl 
				String EnterURL  = driver.getCurrentUrl();
				// calling current URL
				System.out.println("Actual URl is "+EnterURL);
				// Comparing two URL
				if (ExpectedURL.equals(EnterURL)) {
					System.out.println("Both url are same");
				} else {
					System.out.println("Both url are not same");
				}
				// Get TItal
				String Tital = driver.getTitle();
				// calling TITal Name
				System.out.println("Actual tital : "+Tital);
				// calling TItal Length
				System.out.println("get tital length : "+Tital.length());
				// Expected TItal
				String ExpectedTital = "actiTIME - Login";
				// calling Expected TITal 
				System.out.println("Expected tital : "+ExpectedTital);
				// Comparing two tItal
				if (ExpectedTital.equals(Tital)) {
					System.out.println("Both tital are same");
				} else {
					System.out.println("Both tital are not same");
				}
				// page length
				String pagelength = driver.getPageSource();
				// calling page length
				System.out.println("page length : "+pagelength.length());
				// if you want print whole page code its not possible 
				//		System.out.println("page length : "+pagelength);
				//driver.close();
	}

}
