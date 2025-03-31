package genericUtilityExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleFileUtility {
	
	public List<String> getMultipleDataFromExcel(String sheetName, int startRowIndex, int startcellIndex) throws Exception
	{
		
	FileInputStream fis = new FileInputStream("C:\\Users\\04846Y744\\Desktop\\Selenium\\Section 3\\ExcelSheet\\FetchingMultipleData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	
	DataFormatter df = new DataFormatter();
	List<String> a1 = new ArrayList<String>();
	
	for(int i=startRowIndex;i<=sh.getLastRowNum(); i++)
	{
		Row r = sh.getRow(i);
		for(int j=startcellIndex; j<=r.getLastCellNum(); j++)
		{
			Cell c = r.getCell(j);
			String value = df.formatCellValue(c);
			System.out.print(value+" ");
		}
	}
	return a1;

}
}