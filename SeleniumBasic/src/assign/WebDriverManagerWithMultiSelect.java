package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// use setup method of WebDriverManager
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// url
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		// finding element
		WebElement MultiDropDown = driver.findElement(By.cssSelector("#cars"));
		// select class instance
		Select s1 = new Select(MultiDropDown);
		System.out.println("Is it Multiple DropDown:" + s1.isMultiple());
		// first selected option
		String selectedValue = s1.getFirstSelectedOption().getText();
		System.out.println("Option that is present on screen:" + selectedValue);
		// count
		List<WebElement> Schools = s1.getOptions();
		System.out.println("Size is:" + Schools.size());

		// print
		for (int i = 0; i <= Schools.size(); i++) {
			System.out.println(Schools.get(i).getText());
		}
		// select value from dropdownlist
		s1.selectByVisibleText("Audi"); // or
		// s1.selectByValue("opel");//or
		// s1.selectByIndex(3);
		System.out.println(s1.getFirstSelectedOption().getText());
		// get only selected options
		List<WebElement> selected = s1.getAllSelectedOptions();
		System.out.println(selected.size());
		for (int i = 0; i < selected.size(); i++) {
			System.out.println(selected.get(i).getText());
		}
		// unselecting the selected options
		// s1.deselectByVisibleText("Opel"); //or
		// s1.deselectByValue("html");//or
		// s1.deselectByIndex(7);
		s1.deselectAll();
		driver.close();
	}

}