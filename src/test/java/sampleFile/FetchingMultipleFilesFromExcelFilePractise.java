package sampleFile;

import java.util.List;

import genericUtilityExcel.MultipleFileUtility;

public class FetchingMultipleFilesFromExcelFilePractise {

	public static void main(String[] args) throws Exception {
		
		MultipleFileUtility mUtil = new MultipleFileUtility();
		List<String> a1 = mUtil.getMultipleDataFromExcel("Animal", 1, 0);
		System.out.println(a1);
		
		

	}

}
