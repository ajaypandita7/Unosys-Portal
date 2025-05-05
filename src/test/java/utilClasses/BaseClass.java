package utilClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pomClasses.LoginLogoutPOM;


public class BaseClass {
	
	public static WebDriver driver;
	public LoginLogoutPOM log;
	public MypropertiesClass prop;
	public WebDriverWait wait ;
	public ExcelClass excel;

	
	@BeforeClass
	public void browserSettings() throws Exception {
		driver = new ChromeDriver();
		log = new LoginLogoutPOM(driver);
		prop = new MypropertiesClass();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		excel=new ExcelClass();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.inputdata("URL"));
		
		//Login 
		wait.until(ExpectedConditions.visibilityOf(log.username()));
		log.username().sendKeys(prop.inputdata("username"));
		log.password().sendKeys(prop.inputdata("password"));
		log.SignIn().click();
	}
	
	
	@AfterClass
	public void logout() {
		wait.until(ExpectedConditions.elementToBeClickable(log.Logout()));
		log.Logout().click();
		driver.quit();
	}
}
