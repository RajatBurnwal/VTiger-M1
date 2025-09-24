package practice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	@Test(dataProvider = "data1", dataProviderClass = practice.DataProviderPracticeClass.class)
	public void demo(HashMap<String, String> m)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(m.get("url"));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(m.get("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(m.get("password"));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();	
	}
	
	@DataProvider(name = "data")
	public Object[][] getData()
	{
		Object[][] obj = {{"admin","admin","http://localhost:8888"},{"admin","admin123","http://localhost:8080"}};
		return obj;
	}
}
