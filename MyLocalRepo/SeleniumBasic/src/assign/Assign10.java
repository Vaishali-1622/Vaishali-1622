package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign10 {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Vaishali", Keys.TAB);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kshirsagar", Keys.TAB);
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("06, Sai Sundar Appt,Dighi, Pune",
				Keys.TAB);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vaishalifulambarkar@gmail.com", Keys.TAB);
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("8600580928", Keys.TAB);
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		
		WebElement DropDown = driver.findElement(By.cssSelector("div[id='msdd']"));
		DropDown.click();
		driver.findElement(By.xpath("//ul[contains(@class,'autocomplete')]//li[8]")).click();

		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills' ]"));
		Select s1 = new Select(skills);
		s1.selectByIndex(4);
		
		driver.findElement(By.cssSelector("span[dir='ltr']")).click();
		driver.findElement(By.cssSelector("span[class='select2-results']>ul>:nth-child(6)")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s2 = new Select(year);
		s2.selectByIndex(79);
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s3 = new Select(month);
		s3.selectByIndex(5);
		
		WebElement Date = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select s4 = new Select(Date);
		s4.selectByIndex(16);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("vaishali", Keys.chord(Keys.CONTROL, "a"));
		pass.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

	}

}
