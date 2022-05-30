package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class FileUploadUsingAutoIT extends SeleniumUtility{

	@Test
	public void testFileUpload() {
		WebDriver driver=setUp("chrome", "https://the-internet.herokuapp.com/upload");
		WebElement fileUploadButton=driver.findElement(By.id("file-upload"));
		//fileUploadButton.click(); won't work in this case
		action.moveToElement(fileUploadButton).click().perform();
		
		//run autoit .exe to handle file upload popup
		try {
			Runtime.getRuntime().exec("F:\\Acceleration\\Automation Testing\\AutoITSample\\FileUpload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebElement Upload=driver.findElement(By.cssSelector("input[id='file-submit']"));
		action.moveToElement(Upload).click().perform();
		
	}
}
