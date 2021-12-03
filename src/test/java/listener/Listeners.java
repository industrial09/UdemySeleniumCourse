package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test has been started: "+result.getName());		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test has passed sucessfully: "+result.getName());	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed: "+result.getName());			
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has been started: "+result.getName());			
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
