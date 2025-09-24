package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

	@Test
	public void strictLevelComparisonSoftAssertion()
	{
		String expectedValue = "Selenium";
		String actualValue = "Selenium";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		s.assertFalse(actualValue.equals(expectedValue));
		System.out.println("Soft assertion strict level validation successful");
		s.assertAll();
	}
	
	@Test
	public void containsLevelComaprisonSoftAssertion()
	{
		String expectedValue = "ava";
		String actualValue  = "java";
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Soft assertion contains level validtion successfull");
		s.assertAll();
	}
}
