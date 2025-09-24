package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass{

	@Test(groups = {"Sanity"})
	public void CON_001() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String firstName = eUtil.getSingleDataFromExcelFile("Contacts", 1, 1);
		String lastName = eUtil.getSingleDataFromExcelFile("Contacts", 1, 2);
		cncp.createNewContact(driver, firstName, lastName);
	}
	
}
