package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignationPOM {
	public DesignationPOM(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	@FindBy(id = "master")
	WebElement master;
	
	public WebElement master() {
		return master;
	}
	
	@FindBy(linkText = "Designations")
	WebElement DesignationsModule;
	
	public WebElement DesignationsModule() {
		return DesignationsModule;
	}

	@FindBy(xpath = "//a[contains(text(), ' Add Designation ')]")
	WebElement  AddDesignation ;
	
	public WebElement AddDesignation() {
		return AddDesignation;
	}
	
	@FindBy(xpath = "//input[@placeholder='Designation Name']")
	WebElement  DesignationName ;
	
	public WebElement DesignationName() {
		return DesignationName;
	}
	
	@FindBy(xpath = "//input[@id='submit']")
	WebElement  CreateDesignation ;
	
	public WebElement CreateDesignation() {
		return CreateDesignation;
	}
	
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil'])[1]")
	WebElement  ActionButton ;
	
	public WebElement ActionButton() {
		return ActionButton;
	}
	
	
	
	
	
	
	
	
}
