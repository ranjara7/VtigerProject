package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass{
	
	@Test(groups= {"Smoke"})
	public void Con_003() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickonCreatingNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 8, 1);
		String mobile = eUtil.getDataFromExcelFile("Contacts", 8, 2);
		String email = eUtil.getDataFromExcelFile("Contacts", 8, 3);
		String mailingCity = eUtil.getDataFromExcelFile("Contacts", 8, 4);
		String mailingState = eUtil.getDataFromExcelFile("Contacts", 8, 4);
		String mailingCountry = eUtil.getDataFromExcelFile("Contacts", 8, 6);
		
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, mobile, email, mailingCity, mailingState, mailingCountry);
	}

}
