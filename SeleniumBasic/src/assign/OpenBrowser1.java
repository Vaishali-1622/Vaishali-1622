package assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String Title=driver.getTitle();
		System.out.println("Acutal Title is:"+Title);
		String ExpectedTitle="www.facebook.com";
		System.out.println("Expected Title is:"+ExpectedTitle);
		if(ExpectedTitle.equals(Title)) {			//equalsIgnoreCase
			System.out.println("Both the title are same");
		}else {
			System.out.println("Both the title are not same");
		}
		System.out.println("Length of the Title:"+Title.length());
		String PageSource=driver.getPageSource();
		System.out.println("Page Length is :"+PageSource.length());
		if(ExpectedTitle.equals(Title)) {			//equalsIgnoreCase
			System.out.println("Both the title are same");
		}else {
			System.out.println("Both the title are not same");
		}
		//driver.close();
	}

}
