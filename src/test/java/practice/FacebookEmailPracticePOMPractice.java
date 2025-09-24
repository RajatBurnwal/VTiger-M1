package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class FacebookEmailPracticePOMPractice {

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindAll({@FindBy(xpath = "//input[@name='emai']"), @FindBy(id = "email")})
	WebElement ele;
	
	public FacebookEmailPracticePOMPractice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		sUtil.getApplication(driver, "https://www.facebook.com/");
		Thread.sleep(2000);
		FacebookEmailPracticePOMPractice f = new FacebookEmailPracticePOMPractice(driver);
		f.ele.sendKeys("robin@gmail.com");
//		email.sendKeys("robin@gmail.com");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		f.ele.sendKeys("ravin@gmail.com");
		
	}

}
