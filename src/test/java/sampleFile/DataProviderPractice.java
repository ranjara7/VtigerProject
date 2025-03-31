package sampleFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.SeleniumUtility;
import objectRepo.LoginPage;

public class DataProviderPractice {
//	@Test(dataProvider = "getDataHashMap", dataProviderClass = DataProviderMethod.class)
	@Test(dataProvider = "getData")
//	public void practice(HashMap<String, String> m) throws InterruptedException
	
	public void practice(String UN, String PWD) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.maximaizewindow(driver);
		sUtil.navigateToApplication(driver, "http://localhost:8888/");
		LoginPage lp = new LoginPage(driver);
//		System.out.println(m.get("username"));
//		System.out.println(m.get("password"));
//		String UN = m.get("username");
//		String PWD = m.get("password");
		
		lp.loginToApplication(UN, PWD);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(name = "getData")
	public Object[][] loginCredentials()
	{
		return new Object[][] {{"admin", "admin"},{"admin123456", "admin123"}};
			
		}
	}


