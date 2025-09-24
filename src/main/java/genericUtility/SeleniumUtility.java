package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This is an utility class having the functionality from Selenium library
 * @author QSP
 * @version 25-08-19
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to open a web application
	 * @param driver
	 * @param url
	 */
	public void getApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	/**
	 * This is generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	///////********Handling Dropdown*******/////////
	
	/**
	 * This is a generic method to select an option in a dropdown by using its index
	 * @param element
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown by using its value attribute
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown by using its visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionByVisisbleText(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	
	/////////**********Handling Alert******//////////
	
	/**
	 * This is a generic method to accept an alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to cancel an alert
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	///////******Mouse Actions******////////
	
	/**
	 * This is a generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click operation
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform drag and drop operation
	 * @param driver
	 * @param element1
	 * @param element2
	 */
	public void dragAndDropOperation(WebDriver driver, WebElement element1, WebElement element2)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(element1, element2).perform();
	}
	
	//////////*********Explicit wait*******////////////
	
	/**
	 * This is a generic method to wait explicitly for a webelement to be visible
	 * @param driver
	 * @param maxTime
	 * @param locator
	 */
	public void waitForElementToBeVisible(WebDriver driver, int maxTime, By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/////////*********Window scrolling using Javascript*******////////
	
	/**
	 * This is a generic method to perform window scrolling operation
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollingWindow(WebDriver driver, int x, int y)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo("+x+","+y+");");
	}

	/**
	 * This is a generic method to switch to second tab when 2 tabs are present
	 * @param driver
	 */
	public void switchToSecondWindow(WebDriver driver)
	{
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds)
		{
			if(!id.equals(parentId))
				driver.switchTo().window(id);
		}
	}
	
	/**
	 * This is a generic method to fetch current window id
	 * @param driver
	 * @return
	 */
	public String getCurrentWindowId(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	/**
	 * THis is a generic method to switch to a window based on its window id
	 * @param driver
	 * @param windowId
	 */
	public void switchToWindowBasedOnId(WebDriver driver, String windowId)
	{
		driver.switchTo().window(windowId);
	}
	
	/**
	 * This is a generic method to capture the screenshot of a webpage
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String takeScreenshotOfWebPage(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\"+screenshotName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();				//used for listeners
	}
 }
