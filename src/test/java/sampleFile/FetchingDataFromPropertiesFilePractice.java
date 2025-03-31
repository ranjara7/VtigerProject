package sampleFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFilePractice {

	public static void main(String[] args) throws Exception {
		
		PropertiesUtility pUtil = new PropertiesUtility();
		String URL = pUtil.getDataFromPropertiesFile("url");
		String un = pUtil.getDataFromPropertiesFile("username");
		String pwd = pUtil.getDataFromPropertiesFile("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);

	}

}
