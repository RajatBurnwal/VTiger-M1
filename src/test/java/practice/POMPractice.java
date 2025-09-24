package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class POMPractice {

	public static void main(String[] args) throws IOException {

		PropertiesUtility pUtil = new PropertiesUtility();
		SeleniumUtility sUtil=new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		String URL = pUtil.getDataFromPropertiesFile("url");
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		sUtil.getApplication(driver, URL);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		hp.signOutOperation(driver);
		
	}

}
