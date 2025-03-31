package fetchFromExcel;

import genericUtilityExcel.ExcelUtility2;

public class FetchExcelData2 {

	public static void main(String[] args) throws Exception {
		
		ExcelUtility2 eUtility = new ExcelUtility2();
		String value = eUtility.getDataFromExcelFile("Leads", 2, 1);
		String value1 = eUtility.getDataFromExcelFile("Contacts", 5, 1);
		System.out.println(value);
		System.out.println(value1);

	}

}
