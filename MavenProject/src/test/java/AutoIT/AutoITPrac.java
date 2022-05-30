package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class AutoITPrac extends SeleniumUtility {
  @Test
  public void Page() throws IOException, InterruptedException {
	  WebDriver driver=setUp("Chrome","http://omayo.blogspot.com/");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1500)");
	 WebElement ChooseFile = driver.findElement(By.cssSelector("input[id='uploadfile']"));
	 action.moveToElement(ChooseFile).click().perform();
	 Runtime.getRuntime().exec("F:\\Acceleration\\Automation Testing\\AutoITSample\\FileChoose.exe");
	 Thread.sleep(500);
	 driver.close();
  }
}
