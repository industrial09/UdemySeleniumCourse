package setup;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup extends GetConfigData2{
	GetConfigData2 config = new GetConfigData2();
	//List<String> data = config.getData();
	public WebDriver setup(String driverType) {
        System.setProperty("webdriver.chrome.driver", ""/*data.get(0)*/);
        WebDriver driver = null;
        if(driverType == "chrome") driver = new ChromeDriver();
        else if(driverType == "firefox") driver = new FirefoxDriver();
        else if(driverType == "IE") driver = new InternetExplorerDriver();
        driver.get(""/*data.get(1)*/);
        return driver;
    }
}
