package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class TC_001Practice extends BaseClass{

	@Test
	public void LE_001() throws Exception
	{
//		ExcelUtility eUtil = new ExcelUtility();
//		SeleniumUtility sUtil = new SeleniumUtility();
//		PropertiesUtility pUtil = new PropertiesUtility();
//		WebDriver driver = new ChromeDriver();
//		sUtil.maximizeWindow(driver);
//		sUtil.implicitWait(driver, 20);
//		String URL = pUtil.getDataFromPropertiesFile("url");
//		sUtil.getApplication(driver, URL);
//		String UN = pUtil.getDataFromPropertiesFile("username");
//		String PWD = pUtil.getDataFromPropertiesFile("password");
//		LoginPage lop = new LoginPage(driver);
//		lop.loginToApplication(UN, PWD);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String fName = eUtil.getSingleDataFromExcelFile("Leads", 1, 1);
		String lName = eUtil.getSingleDataFromExcelFile("Leads", 1, 2);
		String company = eUtil.getSingleDataFromExcelFile("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
//		hp.signOutOperation(driver);
//		driver.quit();
	}
}
