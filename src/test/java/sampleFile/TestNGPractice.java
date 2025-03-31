package sampleFile;

import org.openqa.selenium.internal.Debug;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Ignore
	@Test(priority = 1) // invocationCount = 3
	public void createUser()
	{
		System.out.println("1. User Created");
	}
	
	@Test(priority = 2, dependsOnMethods = {"deleteUser"}) //here dependsOn means 1st deleteUser will excute.
	public void modifyUser()
	{
		System.out.println("2. User modified");
	}
	
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("3. User deleted");
	}
	

}
