package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class FileUploadWithSeleniumUsingAutoIT_WithParam extends SeleniumUtility{

	@Test
	public void testFileUpload() throws IOException {
		WebDriver driver=setUp("chrome", "https://the-internet.herokuapp.com/upload");
		WebElement fileUploadButton=driver.findElement(By.id("file-upload"));
		//fileUploadButton.click(); won't work in this case
		action.moveToElement(fileUploadButton).click().perform();
		
		//run autoit .exe to handle file upload popup
		try {
			Runtime.getRuntime().exec("F:\\Acceleration\\Automation Testing\\AutoITSample\\FileUploadWithPara.exe"+" "+"C:\\Users\\Home\\Desktop\\IMG_20200221_184522_Bokeh.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebElement dragndrop=driver.findElement(By.cssSelector("div[id='drag-drop-upload']"));
		//fileUploadButton.click(); won't work in this case
		action.moveToElement(dragndrop).click().perform();
		Runtime.getRuntime().exec("F:\\Acceleration\\Automation Testing\\AutoITSample\\FileDragnDrop.exe");
	}
}
