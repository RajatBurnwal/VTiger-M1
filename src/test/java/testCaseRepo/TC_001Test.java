package testCaseRepo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001Test extends BaseClass{
	
	@Test(groups = {"Smoke","Sanity"})
	public void LE_001() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
//		Assert.fail();
		String firstName = eUtil.getSingleDataFromExcelFile("Leads", 1, 1);
		String lastName = eUtil.getSingleDataFromExcelFile("Leads", 1, 2);
		String company = eUtil.getSingleDataFromExcelFile("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(firstName, lastName, company);
	}
	
//	@Test
	public void demo()
	{
		System.out.println("Demo executed");
		String UN = System.getProperty("username");
		System.out.println(UN);
		String PWD = System.getProperty("password");
		System.out.println(PWD);
	}

}
