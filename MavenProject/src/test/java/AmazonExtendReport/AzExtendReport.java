package AmazonExtendReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.types.resources.selectors.Type;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AzExtendReport {

	static ExtentTest check ;
	static ExtentReports report;

	@BeforeClass
	public void first() {
		report = new ExtentReports(".\\ExtendReport\\Amazon.html");
		report
				.addSystemInfo("Host Name", "Vaishali")
				.addSystemInfo("Environment", "QA")
				.addSystemInfo("User Name", "Vaishali Kshirsagar");
		check = report.startTest("Amazon Report Test");
	}
	@Test
	public void load() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		if(driver.getCurrentUrl().equals("https://www.amazon.com/")) {
			check.log(LogStatus.PASS, "Tested ok");

		}else {
			check.log(LogStatus.FAIL,check.addScreenCapture(screenShot(driver)), "Not Ok");
		}
	}

	@AfterClass
	public void last() {
		report.endTest(check);
		report.flush();
		report.close();

	}
	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}
}
