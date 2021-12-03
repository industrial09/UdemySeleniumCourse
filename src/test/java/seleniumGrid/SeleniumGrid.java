package seleniumGrid;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGrid {
	public RemoteWebDriver driver;
	public String appUrl= "https://www.google.com";
	
	@BeforeTest
	public void setup() {
		//Look for solution on this
		//Seems like new version of DesiredCapabilities has changed on this
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testTitle() {
		String googleTitle = driver.getTitle();
		Assert.assertTrue(googleTitle.equals("Google"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
