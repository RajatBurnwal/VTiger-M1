package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewContactPage {

	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name = "account_name")
	private WebElement organizationNameTextField;
	
	@FindBy(name = "title")
	private WebElement titleTextField;
	
	@FindBy(name = "department")
	private WebElement departmentTextField;
	
	@FindBy(name = "email")
	private WebElement emailTextField;
	
	@FindBy(name = "mobile")
	private WebElement mobileTextField;
	
	@FindBy(name = "mailingcity")
	private WebElement mailingCityTextField;
	
	@FindBy(name = "mailingcountry")
	private WebElement mailingCountryTextField;
	
	@FindBy(name = "mailingstate")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement organizationAddIcon;
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getOrganizationAddIcon() {
		return organizationAddIcon;
	}

	/**
	 * This is a business library to create new contact
	 * @param driver
	 * @param fName
	 * @param lName
	 */
	public void createNewContact(WebDriver driver, String fName, String lName)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getOrganizationAddIcon().click();
		SeleniumUtility sUtil = new SeleniumUtility();
		String parentId = sUtil.getCurrentWindowId(driver);	//
		sUtil.switchToSecondWindow(driver);
		OrganizationsPage op = new OrganizationsPage(driver);
		op.clickOnOrganizations();
		sUtil.switchToWindowBasedOnId(driver, parentId);	//
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lName
	 * @param title
	 * @param dept
	 * @param email
	 * @param mobile
	 */
	public void createNewContact(String lName, String title, String dept, String email, String mobile)
	{
		getLastNameTextField().sendKeys(lName);
		getTitleTextField().sendKeys(title);
		getDepartmentTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lName
	 * @param dept
	 * @param mobile
	 * @param email
	 * @param mailingCity
	 * @param mailingCountry
	 * @param mailingState
	 */
	public void createNewContact(String lName, String dept, String mobile, String email, String mailingCity,
			String mailingCountry, String mailingState)
	{
		getLastNameTextField().sendKeys(lName);
		getDepartmentTextField().sendKeys(dept);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getMailingStateTextField().sendKeys(mailingState);
		getSaveButton().click();
	}
}
