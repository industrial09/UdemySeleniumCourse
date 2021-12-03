package mainScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.LoginPage;
import report.Report;
import report.Screenshot;

public class LoginTests extends LoginPage{
	Report reports = new Report();
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void setupBrowser() throws InterruptedException {
		report = reports.generateReport();
		setUp("chrome");
	}
	
	@AfterTest
	public void tearDown(ITestResult result) throws IOException {
		String screenshotpath = Screenshot.takeScreenshot(driver, Screenshot.generateFileName(result));
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
			test.log(Status.FAIL, result.getThrowable());
			test.fail("Screenshot: "+test.addScreenCaptureFromPath(screenshotpath));
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
			test.pass("Screenshot: "+test.addScreenCaptureFromPath(screenshotpath));
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, result.getName());//Check if this line is needed
			test.skip("Screenshot: "+test.addScreenCaptureFromPath(screenshotpath));
		}
		closeBrowser();
	}
	
	@Test
	public void validateLogOutButtonDisplayed() {
		//createTest method is to indicate the test name in the report generated
		test = report.createTest("Validate Log out button is present");
		Assert.assertTrue(validateLogOutBtnIsPresent(), "LogOut button is not present after entering user, pswd and clicking on Login");
	}
	
	@Test
	public void validateSaveButtonDisplayed(){
		Assert.assertTrue(validateSaveBtnIsPresent(), "LogOut button is not present after entering user, pswd and clicking on Login");
	}
}
