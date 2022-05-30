package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Practice {
  @Test
  public void Practice1() throws IOException,FileNotFoundException {
	  FileInputStream source = new FileInputStream(".\\src\\test\\resources\\AppData\\SampleTestData.xlsx");
	  Workbook workbook = new XSSFWorkbook(source);
	  Sheet sheet = workbook.getSheet("Sheet1");
	  Row row = sheet.getRow(1);
	  Cell cell = row.getCell(4);
	  int cellcount = row.getLastCellNum();
	  System.out.println("Cell count:"+cellcount);
	  for(int i=0; i<row.getLastCellNum();i++ ) {
		  System.out.println(row.getCell(i).getStringCellValue());
	  }
	  row.createCell(4).setCellValue("Fail");
	  FileOutputStream target = new  FileOutputStream(".\\src\\test\\resources\\AppData\\SampleTestData.xlsx");
	  workbook.write(target);
	  target.flush();
	  target.close();
  }
}
