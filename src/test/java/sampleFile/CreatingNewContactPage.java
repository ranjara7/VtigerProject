package sampleFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is a Creating New Contact page POM class
 * @author RajeevRanjan73
 * @version 25.03.11
 */
public class CreatingNewContactPage {
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextField;
	
	@FindBy(id = "title")
	private WebElement titleTextField;

}
