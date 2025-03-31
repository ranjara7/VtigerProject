package genericUtilityExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.IPathUtility;

public class ExcelUtility2 {
	/*
	 * This is a generic method to fetch a single cell data from excel file
	 * @param sheetname
	 * @param rowIndex
	 * @param cellIndex
	 * @throws Exception
	 */
	public String getDataFromExcelFile(String Sheet, int row, int cell) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
		
	}

}
