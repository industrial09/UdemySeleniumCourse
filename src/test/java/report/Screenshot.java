package report;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Screenshot {
	//SSS denotes 3 digits of milliseconds�
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd SSS");
	
	public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		
		String dest = System.getProperty("user.dir")+screenshotName+".png";
		File target = new File(dest);
		FileUtils.copyFile(source, target);
		return dest;
	}
	
	public static String generateFileName(ITestResult result) {
		Date date = new Date();
		String fileDateName=result.getName()+"_"+ dateFormat.format(date);
		return fileDateName;
	}
}
