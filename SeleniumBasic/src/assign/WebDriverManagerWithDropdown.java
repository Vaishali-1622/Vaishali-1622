package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerWithDropdown {

	public static void main(String[] args) throws InterruptedException {
		//or Use WebDriverManager to manager chrome browser executable based on system requirement
				//use setup method of WebDriverManager
				WebDriverManager.chromedriver().setup();
				//step2: create an instance of Chrome Browser
				WebDriver driver = new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://demosite.executeautomation.com/");	
				driver.findElement(By.cssSelector("input[name='UserName']")).sendKeys("execution");
				driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("admin");
				driver.findElement(By.cssSelector("input[name='Login']")).click();
				Thread.sleep(500);
				//find the dropdownlist 
				WebElement dropDownList=driver.findElement(By.id("TitleId"));
				//Create an instance of Select class(predefined class) and pass dropdown list WebElement as a parameter in its constructor  */ 
				Select t1= new Select(dropDownList);
				System.out.println("Is It MultipleDropDown List:"+t1.isMultiple());
				//count in dropdown
				List<WebElement>Total=t1.getOptions();
				System.out.println("Size is:"+Total.size());
				//printing 
				for(WebElement Options:Total) {
					System.out.println("Options are: "+Options.getText());
				}
				//get already selected option
				String selectedValue=t1.getFirstSelectedOption().getText();
				System.out.println("Option that is present on screen:"+selectedValue);
				//select required value from dropdown
				//t1.selectByVisibleText("Mr."); 
				//t1.selectByIndex(2);
				t1.selectByValue("2");
				System.out.println(t1.getFirstSelectedOption().getText());
				Thread.sleep(500);
				//driver.close();
			}
				
		}