package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer{
	
	int count = 0;
	int maxCount = 4;

	@Override
	public boolean retry(ITestResult result) {
		
		while(count<maxCount)
		{
			count++;
			return true;
		}
		
		// TODO Auto-generated method stub
		return false;
	}

}
