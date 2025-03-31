package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass{
	
	@Test(groups= {"Sanity", "Regression"})
	public void Con_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();;
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickonCreatingNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String title = eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String email = eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String mobile = eUtil.getDataFromExcelFile("Contacts", 5, 4);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, title, email, mobile);
		
	}
	

}
