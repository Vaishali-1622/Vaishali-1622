package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
	@Test
	public void getSheetName() throws FileNotFoundException, IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\AppData\\SampleTestData.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook x = new XSSFWorkbook(fis);
		// 3. perform operation on sheet
		int sheetCount = x.getNumberOfSheets();// give you sheet count present inside excel
		System.out.println("Sheet count: " + sheetCount);
		System.out.println("Active sheet index: " + x.getActiveSheetIndex());
		for (int i = 0; i < sheetCount; i++) {
			System.out.println(x.getSheetName(i));
		}
	}

	@Test
	public void getRowOperation() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\AppData\\SampleTestData.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook x = new XSSFWorkbook(fis);
		// 3. get sheet
		XSSFSheet sheet = x.getSheet("Sheet1");
		// 4. get row
		int rowCount = sheet.getLastRowNum();// in current how many rows are present...row-1
		System.out.println("RowCount: " + rowCount);
	}

	@Test
	public void getCellCount() throws IOException {
		// *****FileLocation
		FileInputStream fis = new FileInputStream(".\\AppData\\SampleTestData.xlsx");

		// *****Create an instance of respective workbook class and provide file
		// location to its constructor
		// XSSFWorkbook workBook=new XSSFWorkbook(fis);
		// or more generic way
		Workbook workbook = new XSSFWorkbook(fis);

		// **** Get Sheet info
		// XSSFSheet sheet=workbook.getSheet("Sheet1");
		// or more generic way
		Sheet sheet = workbook.getSheet("Sheet1");

		// **** for particular raw
		// XSSFRow row=sheet.getRow(1);
		// or
		Row row = sheet.getRow(1);

		// *** Cell info
		int cellCount = row.getLastCellNum();// actual count
		System.out.println("Cell count in row1 of sheet1: " + cellCount);

		// get cell
		// XSSFCell cell=row.getCell(0);
		// or
		Cell cell = row.getCell(2);

		// get value form cell
		String cellValue = cell.getStringCellValue();
		System.out.println("cell value form row1 sheet1: " + cellValue);
		System.out.println("************************");
		// get all cell value
		for (int i = 0; i < cellCount; i++) {
			System.out.println(row.getCell(i).getStringCellValue());
		}
	}

	@Test
	public void updateExcel() throws IOException {
		// *****FileLocation
		FileInputStream fis = new FileInputStream(".\\AppData\\SampleTestData.xlsx");

		// *****Create an instance of respective workbook class and provide file
		// location to its constructor
		// XSSFWorkbook workBook=new XSSFWorkbook(fis);
		// or more generic way
		Workbook workbook = new XSSFWorkbook(fis);

		// **** Get Sheet info
		// XSSFSheet sheet=workbook.getSheet("Sheet1");
		// or more generic way
		Sheet sheet = workbook.getSheet("Sheet1");

		// **** for particular raw
		// XSSFRow row=sheet.getRow(1);
		// or
		Row row = sheet.getRow(1);
		row.createCell(4).setCellValue("Pass");
		// update excel file content

		// Identify the location where you want to store your new/update data
		FileOutputStream fos = new FileOutputStream(".\\AppData\\SampleTestData.xlsx");
		// write you content into your excel file
		workbook.write(fos);
		// flush the content from stream to excel file
		fos.flush();
		// close the stream to save the data
		fos.close();
		System.out.println("Updated excel");
	}

}
