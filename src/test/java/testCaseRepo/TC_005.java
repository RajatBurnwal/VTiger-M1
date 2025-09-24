package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass{

	@Test(groups = {"Regression"})
	public void CON_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		String lastName = eUtil.getSingleDataFromExcelFile("Contacts", 4, 1);
		String title = eUtil.getSingleDataFromExcelFile("Contacts", 4, 2);
		String department = eUtil.getSingleDataFromExcelFile("Contacts", 4, 3);
		String email = eUtil.getSingleDataFromExcelFile("Contacts", 4, 4);
		String mobile = eUtil.getSingleDataFromExcelFile("Contacts", 4, 5);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lastName, title, department, email, mobile);
	}
}
