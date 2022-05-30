package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWithCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//place from
		driver.findElement(By.cssSelector("input[id='src']")).sendKeys("Pune");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li[data-id='68667']")).click();
		//place to
		driver.findElement(By.cssSelector("input[id='dest']")).sendKeys("Goa");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li[data-id='76065']")).click();
		//click on date
		driver.findElement(By.cssSelector("input#onward_cal")).click();
		Thread.sleep(500);
		//next
		driver.findElement(By.cssSelector(".next")).click();
		Thread.sleep(500);
		//date
		driver.findElement(By.cssSelector("table[class='rb-monthTable first last']>tbody>:nth-child(5)>:nth-child(4)")).click();
		Thread.sleep(500);
		//click on search
		driver.findElement(By.cssSelector("button.fl.button")).click();
		Thread.sleep(500);
		
		//click after 6pm
		driver.findElement(By.cssSelector(".dept-time.dt-time-filter>:nth-child(4)>:nth-child(2)")).click();
		Thread.sleep(500);
		//click type AC
		WebElement Ac= driver.findElement(By.cssSelector("ul.list-chkbox>:nth-child(3)>:nth-child(2)"));
		Ac.click();
		//get first text bus name n price
	   
	    System.out.println( driver.findElement(By.cssSelector("div[class='travels lh-24 f-bold d-color']")).getText());
	    System.out.println(driver.findElement(By.cssSelector("span[class='f-19 f-bold']")).getText());
	    Thread.sleep(500);
	    // for multiple list
	    List<WebElement> BusList=driver.findElements(By.cssSelector(".bus-items>div>li>div>:nth-child(2)>div>div>div"));
	    System.out.println("Size is:"+BusList.size());
	    for(WebElement List:BusList) {
	    	System.out.println("Buses names are:"+List.getText());
	    }
	    //printing price
	    List<WebElement> PriceList=driver.findElements(By.cssSelector(".bus-items>div>li>div>:nth-child(2)"));
	    System.out.println("Size is:"+PriceList.size());
	    for(WebElement List:PriceList) {
    	System.out.println("Buses names are:"+List.getText());
	    }
		driver.close();
			}
				
		}