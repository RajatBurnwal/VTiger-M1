package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{

	@Test(groups = {"Smoke","Regression"}, retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void LE_003() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lastName = eUtil.getSingleDataFromExcelFile("Leads", 7, 1);
		String company = eUtil.getSingleDataFromExcelFile("Leads", 7, 2);
		String title = eUtil.getSingleDataFromExcelFile("Leads", 7, 3);
		String email = eUtil.getSingleDataFromExcelFile("Leads", 7, 4);
		String country = eUtil.getSingleDataFromExcelFile("Leads", 7, 5);
		String city = eUtil.getSingleDataFromExcelFile("Leads", 7, 6);
		String state = eUtil.getSingleDataFromExcelFile("Leads", 7, 7);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lastName, company, title, email, country, city, state);
	}

}
