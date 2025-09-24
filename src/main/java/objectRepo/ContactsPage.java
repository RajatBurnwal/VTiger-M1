package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement creatingNewContactIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatingNewContactIcon() {
		return creatingNewContactIcon;
	}
	
	/**
	 * This is a business library to click on Creating new Contact icon
	 */
	public void clickOnCreatingNewContactIcon()
	{
		getCreatingNewContactIcon().click();
	}
}
