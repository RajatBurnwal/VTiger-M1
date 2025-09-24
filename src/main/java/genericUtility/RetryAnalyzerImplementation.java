package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {

	int count = 1;
	int maxCount = 4;		//found by manual interpretation
	
	@Override
	public boolean retry(ITestResult result) {
		
		//1<=4 -> retry, 2<=4 -> retry ...........4<=4 -> retry,  5<=4 -> stop retry
		while(count<=maxCount)
		{
			count++;
			return true;
		}
		return false;
	}

}