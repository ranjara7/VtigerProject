package testCaseRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class Test_TC_001 extends BaseClass {
	
	@Test(groups= {"Smoke", "Regression"})
	public void LE_001() throws Exception
	{
		HomePage hp= new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
		
		//Assert.fail();
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
	}

}
