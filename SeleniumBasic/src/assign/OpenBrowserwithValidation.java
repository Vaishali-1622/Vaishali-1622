package assign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowserwithValidation {

	private static By logoutLink;
	private static By login;

	public static void main(String[] args) throws InterruptedException {
		// creating path
		String path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		// calling path
		System.setProperty("webdriver.chrome.driver", path);
		// create instance of driver class
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// set window size based on our requirement
		driver.manage().window().setSize(new Dimension(500, 700));
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		WebElement userNameInputField = driver.findElement(By.id("username"));

		System.out.println("Username input field visibility status is : " + userNameInputField.isDisplayed());
		System.out.println("Username input field editable status is : " + userNameInputField.isEnabled());
		String actualTextUsernameField = userNameInputField.getAttribute("placeholder");
		System.out.println("Default text validation for username field: " + actualTextUsernameField.equals("Username"));
		// perform appropriate action the identified element
		userNameInputField.sendKeys("admin");

		// identify the required element from the UI
		WebElement passwordInputField = driver.findElement(By.name("pwd"));

		System.out.println("Password input field visibility status is : " + passwordInputField.isDisplayed());
		System.out.println("Password input field editable status is : " + passwordInputField.isEnabled());
		String actualTextPasswordField = passwordInputField.getAttribute("placeholder");
		System.out.println("Default text validation for password field: " + actualTextPasswordField.equals("Password"));
		// perform appropriate action the identified element
		passwordInputField.sendKeys("manager");
		driver.manage().window().maximize();

		// identify remember check box
		WebElement checkBox = driver.findElement(By.name("remember"));

		System.out.println("Keep me loggedin checkbox visibility status is : " + checkBox.isDisplayed());
		System.out.println("Keep me loggedin checkbox clickable status is : " + checkBox.isEnabled());
		System.out.println("Keep me loggedin checkbox default status is : " + checkBox.isSelected());
		checkBox.click();
		System.out.println("Keep me loggedin checkbox after click, status is : " + checkBox.isSelected());

		// identify the required element from the UI
		WebElement loginButton = driver.findElement(By.id("loginButton"));

		System.out.println("Tag name for login button : " + loginButton.getTagName());

		System.out.println("Login button visibility status is : " + loginButton.isDisplayed());
		System.out.println("Login button clickable status is : " + loginButton.isEnabled());
		String actaulButtonName = loginButton.getText();
		System.out.println("Login button name validation: " + actaulButtonName.equals("Login"));
		driver.findElement(By.cssSelector("#loginButton > div")).click();
		// Navigation in browser
		Thread.sleep(2000);
		// go to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		// next page
		driver.navigate().forward();
		Thread.sleep(2000);
		// reload or refresh current page
		driver.navigate().refresh();
		Thread.sleep(2000);
		// jump from current page to another page or URL
		// driver.navigate().to("https://www.amazon.in/");
		// identify the required element from the UI
		driver.findElement(By.cssSelector("#logoutLink")).click();
		driver.quit();
		// driver.close();
	}
}
