package sampleFile;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractise {
	
	@Test
	public void strictLevelComparision()
	{
		String expectedName = "Ramesh";
		String actualName = "Ram";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualName, expectedName);
		s.assertTrue(actualName.equals(expectedName));
		System.out.println("1. Soft assertion strict level completed");
		s.assertAll();
	}
	
	@Test
	public void containsLevelComparision()
	{
		String s1 = "hell";
		String s2 = "Hello";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(s2.contains(s1), true);
		s.assertAll();
		System.out.println("2. Soft assertion strict level completed");
	}

}
