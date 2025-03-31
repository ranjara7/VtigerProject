package fetchFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\04846Y744\\Desktop\\Selenium\\Section 3\\ExcelSheet\\FetchDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Trees");
		Row r = sh.getRow(2);
		Cell c = r.getCell(0);
		//String value = c.getStringCellValue();
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		
		System.out.println(value);

	}

}
