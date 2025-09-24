package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass {

	@Test(groups = {"Regression"})
	public void CON_003() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		String lastName = eUtil.getSingleDataFromExcelFile("Contacts", 7, 1);
		String department = eUtil.getSingleDataFromExcelFile("Contacts", 7, 2);
		String mobile = eUtil.getSingleDataFromExcelFile("Contacts", 7, 3);
		String email = eUtil.getSingleDataFromExcelFile("Contacts", 7, 4);
		String mailingCity = eUtil.getSingleDataFromExcelFile("Contacts", 7, 5);
		String mailingState = eUtil.getSingleDataFromExcelFile("Contacts", 7, 6);
		String mailingCountry = eUtil.getSingleDataFromExcelFile("Contacts", 7, 7);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lastName, department, mobile, email, mailingCity, mailingCountry, mailingState);
	}
}
