package sampleFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone16 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\04846Y744\\Desktop\\Selenium\\Section 3\\SearchIphone16.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String sr = prop.getProperty("search");
		String Url = prop.getProperty("Url");
		
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sr, Keys.ENTER);
		

	}

}
