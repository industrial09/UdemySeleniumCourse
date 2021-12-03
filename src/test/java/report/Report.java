package report;

import org.testng.Assert;
import org.testng.SkipException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	ExtentReports report;
	ExtentSparkReporter htmlReport;
	public ExtentReports generateReport() {
		//Generate report in a specific path
		htmlReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/report.html");
		//Attach report to extent report object
		report.attachReporter(htmlReport);
		//Add env or system configuration
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Iteration", "19");
		report.setSystemInfo("Testing Type", "Regression");
		return report;
	}
	
	public void passTestStep() {
		System.out.println("Test step has been passed");
		Assert.assertTrue(true);
	}
	
	public void failTestStep() {
		System.out.println("Test step has been failed");
		Assert.assertTrue(false);
	}
	
	public void skipTestStep() {
		System.out.println("Test step has been skipped");
		throw new SkipException("Step has been skippped");
	}
}
