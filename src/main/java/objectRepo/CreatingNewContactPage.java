package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Creating New Contact page POM class
 * @author RajeevRanjan73
 * @version 25.03.11
 */

public class CreatingNewContactPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(id="title")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingcityTextField;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingcountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//create getter - Source> Generate Getters and Setters
	
	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingcityTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingcountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param firstName
	 * @param lastName
	 * @param title
	 */
	
	public void createNewContact(String firstName, String lastName, String title)
	{
		getFirstnameTextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param lastName
	 * @param title
	 * @param email
	 * @param mobile
	 */
	
	public void createNewContact(String lastName, String title, String email, String mobile)
	{
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
		
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param lastName
	 * @param mobile
	 * @param email
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContact(String lastName, String mobile, String email, String mailingCity, String mailingState, String mailingCountry)
	{
		getLastNameTextField().sendKeys(lastName);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingStateTextField().sendKeys(mailingState);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}
	

}
