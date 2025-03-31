package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author RajeevRanjan73
 *
 */
public class ContactsPage {
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactsIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewContactsIcon()
	{
		return createNewContactsIcon;
	}
	/**
	 * This is a business library to click on create new Contacts icon
	 */
	public void clickonCreatingNewContactIcon()
	{
		getCreateNewContactsIcon().click();
	}

}
