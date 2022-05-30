package MockRetryConcept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MockRetryAnalyzer implements IRetryAnalyzer {
	int count=0;
	int limit=3;
	
  @Override
  public boolean retry(ITestResult result){
	  	if(count<limit) {
	  		count++;
	  		return true;
	  	}else {
	  		return false;
	  	}
  }
}
