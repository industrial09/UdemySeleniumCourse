package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends LocatorsPage{
public WebDriver driver = null;
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	LocatorsPage loc = new LocatorsPage();
	AccountPage ap = new AccountPage();
	
	public void setUp(String browser) throws InterruptedException {
		ap.getDataTest();
		Thread.sleep(1500);
		driver = setup(browser);
		driver.manage().window().maximize();
	}
	
	public void enterUSerName(String userName) {
		WebElement el = driver.findElement(By.id(usernameId));
		wait.until(ExpectedConditions.visibilityOf(el));
		loc.enterData(el, userName);
	}
	
	public void enterPasswrod(String pswd) {
		WebElement el = driver.findElement(By.id(passwordID));
		wait.until(ExpectedConditions.visibilityOf(el));
		loc.enterData(el, pswd);
	}
	
	public void clickOnLoginBtn() {
		WebElement el = driver.findElement(By.id(loc.logInButtonId));
		wait.until(ExpectedConditions.visibilityOf(el));
		loc.clickOnElement(el);
	}
	
	public boolean validateLogOutBtnIsPresent() {
		boolean state= false;
		enterUSerName("Christian");
		enterPasswrod("12345");
		clickOnLoginBtn();
		WebElement el = driver.findElement(By.id(loc.logOutButtonId));
		wait.until(ExpectedConditions.visibilityOf(el));
		state = loc.validateElementIsPresent(el);
		return state;
	}
	
	public boolean validateSaveBtnIsPresent() {
		enterUSerName("Christian");
		enterPasswrod("12345");
		clickOnLoginBtn();
		boolean state= false;
		WebElement el = driver.findElement(By.id(loc.saveButtonId));
		wait.until(ExpectedConditions.visibilityOf(el));
		state = loc.validateElementIsPresent(el);
		return state;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
