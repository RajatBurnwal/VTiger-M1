package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	@Test
	public void strictLevelComparisonHardAssertion()
	{
		String expectedValue = "Raju";
		String actualValue = "Raj";
//		Assert.assertEquals(actualValue, expectedValue);
		Assert.assertTrue(actualValue.equals(expectedValue));
		System.out.println("Hard Asserstion strict level validation executed");
	}
	
	@Test
	public void containsLevelComparisonHardAssertion()
	{
		String expectedValue = "don";
		String actualValue = "London";
//		Assert.assertTrue(actualValue.contains(expectedValue));
		Assert.assertEquals(actualValue.contains(expectedValue), true);
		System.out.println("Hard Assertion contains level validation executed");
	}
}
