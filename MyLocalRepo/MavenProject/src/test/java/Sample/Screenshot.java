package Sample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	@Test
	public void takeScreenshotForGoogle() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/");
			Thread.sleep(2000);
			// downcast the driver to access TakesScreenshot method
					TakesScreenshot ts = (TakesScreenshot) driver;
					// capture screenshot as output type FILE
					File vaishu = ts.getScreenshotAs(OutputType.FILE);	
					try {
						// save the screenshot taken in destination path
						FileUtils.copyFile(vaishu, new File(".\\ScreenShot\\google.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("page screenshot is taken");
					driver.close();
		}
}
