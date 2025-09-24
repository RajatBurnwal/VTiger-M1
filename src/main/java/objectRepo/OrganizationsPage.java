package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	@FindBy(xpath = "//a[contains(text(),'Organization Name')]/../../following-sibling::tr/td/a")
	private WebElement organizationName;
	
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}
	
	public void clickOnOrganizations()
	{
		getOrganizationName().click();
	}
}
