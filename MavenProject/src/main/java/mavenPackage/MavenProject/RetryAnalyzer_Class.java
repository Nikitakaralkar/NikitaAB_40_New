package mavenPackage.MavenProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer_Class implements IRetryAnalyzer {
	
	int initial_count=0;
	int retry_count=2;
	@Override
	public boolean retry(ITestResult result) {
	
		while(initial_count<retry_count)
		{
			initial_count++;
			return true;
		}

		
		return false;
		

}
}
