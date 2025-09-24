package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class AnnotationsPractice {

	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("Before Suite execution done");
	}
	
	@Test
	public void testMethod1()
	{
		System.out.println("Test method 1 executed");
	}
	
	@AfterMethod
	public void amConfig()
	{
		System.out.println("After method execution done");
	}
	
	@AfterClass
	public void acConfig()
	{
		System.out.println("After class execution done");
	}
	
	@BeforeClass
	public void bcConfig()
	{
		System.out.println("Before class execution done");
	}
	
	@BeforeMethod
	public void bmConfig()
	{
		System.out.println("Before method execution done");
	}
	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("After Suite execution done");
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("Test method 2 executed");
	}
	
}
