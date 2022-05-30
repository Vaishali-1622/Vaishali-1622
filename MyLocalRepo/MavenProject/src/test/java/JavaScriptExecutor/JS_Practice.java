package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;

public class JS_Practice extends SeleniumUtility {
  @Test
  public void flogin() throws InterruptedException {
	  setUp("Chrome","https://opensource-demo.orangehrmlive.com/");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("document.getElementById('txtUsername').value='Admin';");
	  Thread.sleep(500);
	  js.executeScript("document.getElementById('txtPassword').value='admin123';");
	  Thread.sleep(500);
	  js.executeScript("document.getElementById('btnLogin').click();");
	  Thread.sleep(500);
	  js.executeScript("document.getElementById('menu_admin_viewAdminModule').click();");
	  //js.executeScript("document.getElementByCss('tbody>tr>td>input[id='ohrmList_chkSelectRecord_10']').checked=false;");
	  js.executeScript("history.go(0)");// refresh
  }
}
