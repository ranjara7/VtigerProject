package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextfield;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTextfield;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadsourceDropdown ;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeesTextField ;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement stateTextField ;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}
	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}
	public WebElement getCompanyTextfield() {
		return companyTextfield;
	}
    public WebElement getLeadsourceDropdown() {
		return leadsourceDropdown;
	}
	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}
	public WebElement getMobileTextField() {
		return mobileTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getCityTextField() {
		return cityTextField;
	}
	public WebElement getCountryTextField() {
		return countryTextField;
	}
	public WebElement getStateTextField() {
		return stateTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewLead(String firstName,String lastName,String company)
	{
		getFirstNameTextfield().sendKeys(firstName);
		getLastNameTextfield().sendKeys(lastName);
		getCompanyTextfield().sendKeys(company);
		getSaveButton().click();
	}
	
	public void createNewLead(String lastName,String company,String leadSource,String noOfEmployees,String mobile)
	{
		getLastNameTextfield().sendKeys(lastName);
		getCompanyTextfield().sendKeys(company);
		
		Select sel=new Select(getLeadsourceDropdown());
		sel.selectByValue(leadSource);
		
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
		
	}
	
	public void createNewlead(String lastName,String company,String noOfEmployees,String mobile,String email,String city,String country,String state)
	{
		getLastNameTextfield().sendKeys(lastName);
		getCompanyTextfield().sendKeys(company);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getCityTextField().sendKeys(city);
		getCountryTextField().sendKeys(country);
		getStateTextField().sendKeys(state);
		getSaveButton().click();
	}

	
	
	
	

}