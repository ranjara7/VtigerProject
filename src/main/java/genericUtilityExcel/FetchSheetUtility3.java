package genericUtilityExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchSheetUtility3 {
	
	public String getDataFromExcel(String sheet, int rowIndex, int cellIndex) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\04846Y744\\Desktop\\Selenium\\Section 3\\ExcelSheet\\FetchDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		
		//String value= c.getStringCellValue();
		return value;
		
		
	}

}
