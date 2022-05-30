package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class ActiTimeLogin extends SeleniumUtility {
	WebDriver driver; // initialize

	public ActiTimeLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "input[id='username']")
	private WebElement userInputField;

	@FindBy(css = "input[name='pwd']")
	private WebElement passwordInputField;

	@FindBy(css = "#loginButton")
	private WebElement loginButton;

	public WebElement getUserInputField() {
		return userInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void loginTime(String username, String password ) {
		typeInput(userInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}

}
