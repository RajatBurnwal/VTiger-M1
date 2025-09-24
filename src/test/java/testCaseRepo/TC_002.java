package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass{

	@Test(groups = {"Sanity"})
	public void LE_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lastName = eUtil.getSingleDataFromExcelFile("Leads", 4, 1);
		String company = eUtil.getSingleDataFromExcelFile("Leads", 4, 2);
		String leadSource = eUtil.getSingleDataFromExcelFile("Leads", 4, 3);
		String noOfEmployees = eUtil.getSingleDataFromExcelFile("Leads", 4, 4);
		String mobile = eUtil.getSingleDataFromExcelFile("Leads", 4, 5);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lastName, company, leadSource, noOfEmployees, mobile);
	}
}
