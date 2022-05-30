package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumUtility.SeleniumUtility;

public class ActiTimeHome extends SeleniumUtility {
	WebDriver Driver;//initiliaze
	
	public ActiTimeHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="tr>:nth-child(4)>a")
	private WebElement clickTask;

	public WebElement getclickTask() {
		return clickTask;
	}
	
	@FindBy(css="div[class='addNewButton']")
	private WebElement addNew;
	
	public WebElement getAddNew() {
		return addNew;
	}
	
	@FindBy(css="div[class='item createNewTasks']")
	private WebElement createTask;
	
	
	public WebElement getCreateTask() {
		return createTask;
	}
	
	@FindBy(css="div[class='comboboxButton focused']>:nth-child(3)")
	private WebElement newCompany;
	
	
	public WebElement getNewCustomer() {
		return newCompany;
	}
	
//	@FindBy(xpath="//div[@class='searchItemList']/div[@class='itemRow selected']")
//	private WebElement newProject;
//	
//	
//	public WebElement getNewProject() {
//		return newProject;
//	}


	public void clickOnTask() {
		clickOnElement(clickTask);
		clickOnElement(addNew);
		clickOnElement(createTask);
		clickOnElement(newCompany);
		//clickOnElement(newProject);
	}

	
	
}
