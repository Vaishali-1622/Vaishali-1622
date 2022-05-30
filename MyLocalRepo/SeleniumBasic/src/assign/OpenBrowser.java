package assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String ExpectedUrl="https://www.google.com/";
		System.out.println("Expected Url is:"+ExpectedUrl);
		String EnterUrl=driver.getCurrentUrl();
		System.out.println("Actual Url is:"+EnterUrl);
		if(ExpectedUrl.equals(EnterUrl)) {
			System.out.println("Both the URL are same");
		}else {
			System.out.println("Both the URL are not same");
		}
		String Title=driver.getTitle();
		System.out.println("Actual Title:"+Title);
		System.out.println("Get Title Length:"+Title.length());
		String ExpectedTitle="google";
		System.out.println("Expected Title:"+ExpectedTitle);
		if(ExpectedTitle.equals(Title)) {
			System.out.println("Both the Title are same");
		}else {
			System.out.println("Both the Title are not same");
			String pagelength=driver.getPageSource();
			System.out.println("Page Length is:"+pagelength.length());
			driver.close();
		}
	}

}
