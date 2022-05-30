package Sample;

import org.testng.annotations.Test;

public class ExcelUpdate {
	// read row1 data and login into actitime application
		@Test
		public void loginIntoActitme() {
			ExcelOperations ex = new ExcelOperations();
			String appUrl = ex.getCellValue(".\\AppData\\Demo.xlsx", "Sheet1", 2, 0);
			String username = ex.getCellValue(".\\AppData\\Demo.xlsx", "Sheet1", 2, 1);
			String password = ex.getCellValue("..\\AppData\\Demo.xlsx", "Sheet1", 2, 2);
			String expectedTitle = ex.getCellValue(".\\AppData\\Demo.xlsx", "Sheet1", 2, 3);
			System.out.println(appUrl);
			System.out.println(username);
			System.out.println(password);

//			setUp("chrome", appUrl);
//			System.out.println("Actual title: "+getCurrentTitleOfApplication());
//			
//			if(getCurrentTitleOfApplication().equals(expectedTitle)) {
//				ex.updateCellValue(".\\AppData\\Demo.xlsx", "Sheet1", 2, 4,"pass");
//				Assert.assertEquals(getCurrentTitleOfApplication(), expectedTitle,
//						"Either login was not successfull or title got changed");
//			}else {
//				ex.updateCellValue(".\\AppData\\Demo.xlsx", "Sheet1", 2, 4,"failed");
//				Assert.assertEquals(getCurrentTitleOfApplication(), expectedTitle,
//						"Either login was not successfull or title got changed");
//			}
//			cleanUp();
		}
	}
