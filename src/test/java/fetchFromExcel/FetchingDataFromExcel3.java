package fetchFromExcel;

import genericUtilityExcel.FetchSheetUtility3;

public class FetchingDataFromExcel3 {

	public static void main(String[] args) throws Exception {
		FetchSheetUtility3 fUtil = new FetchSheetUtility3();
		String value = fUtil.getDataFromExcel("Animal", 4, 3);
		System.out.println(value);

	}

}
