package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPOM {
	
	public LoginLogoutPOM(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	
	public WebElement username() {
		return username;
	}
	
	@FindBy(id = "password")
	WebElement password;
	
	public WebElement password() {
		return password;
	}
	
	@FindBy(xpath = "//input[@value='SIGN IN']")
	WebElement SignIn;
	
	public WebElement SignIn() { 
		return SignIn;
	}
	
	@FindBy(linkText = "Log Out")
	WebElement Logout;
	
	public WebElement Logout() { 
		return Logout;
	}
	
	@FindBy(xpath = "//li[@id='dashboard']")
	WebElement DashboardModule;
	
	public WebElement DashboardModule() { 
		return DashboardModule;
	}
}
