package assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser2 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Acutal Url is:" + ActualUrl);
		String ExpectedUrl = "https://www.faceBook.com/";
		System.out.println("Expected Url is:" + ExpectedUrl);
		if (ExpectedUrl.equalsIgnoreCase(ActualUrl)) {
			System.out.println("Both the Url are same");
		} else {
			System.out.println("Both the Url are not same");

		}
		String Title = driver.getTitle();
		String ExpectedTitle = "Facebook";
		System.out.println("Length of the Title:" + Title.length());
		String PageSource = driver.getPageSource();
		System.out.println("Page Length is :" + PageSource.length());
		if (ExpectedTitle.equals(Title)) { // equalsIgnoreCase
			System.out.println("Both the title are same");
		} else {
			System.out.println("Both the title are not same");
		}
		driver.close();
	}

}
