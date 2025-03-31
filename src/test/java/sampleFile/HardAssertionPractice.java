package sampleFile;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	@Test
	public  void strictLevelComparison()
	{
		String expectedName = "Ramesh";
		String actualName = "Ram";
		
		Assert.assertEquals(actualName, expectedName);
		System.out.println("1. Hard Assertion strict level completed");
	}
	
	@Test
	public void containsLevelComparision()
	{
		String s1 = "Paris";
		String s2 = "Pariss";
		
		Assert.assertTrue(s2.contains(s1));
		System.out.println("2. Hard Assertion contains level completed");
	}
	

}
