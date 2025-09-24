package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {

	int i=0;

	@Test(retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void demo()
	{
		i++;
		System.out.println("Hello");
		if(i<3)			//condition given to understand if a flaky test is passed before max count, it will stop retry
			Assert.fail();
	}
}
