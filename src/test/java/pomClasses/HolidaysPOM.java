package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysPOM {
	
	public HolidaysPOM(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	@FindBy(id = "master")
	WebElement master;
	
	public WebElement master() {
		return master;
	}
	
	@FindBy(linkText = "Holidays")
	WebElement HolidaysModule;
	
	public WebElement HolidaysModule() {
		return HolidaysModule;
	}
	
	@FindBy(xpath = "//a[contains(text(), ' Add Holiday ')]")
	WebElement  AddHoliday ;
	
	public WebElement  AddHoliday() {
		return  AddHoliday ;
	}
	
	@FindBy(id = "from_date")
	WebElement fromdate;
	
	public WebElement fromdate() {
		return fromdate;
	}
	
	@FindBy(xpath = "//a[@title='Next']")
	WebElement Nextbutton;
	
	public WebElement Nextbutton() {
		return Nextbutton;
	}
	
	@FindBy(xpath = "//a[contains(text(), '15')]")
	WebElement HolidayDate;
	
	public WebElement HolidayDate() {
		return HolidayDate;
	}
	
	@FindBy(id = "to_date")
	WebElement todate;
	
	public WebElement todate() {
		return todate;
	}
	
	@FindBy(id = "holiday_name")
	WebElement HolidayName;
	
	public WebElement HolidayName() {
		return HolidayName;
	}
	
	@FindBy(xpath = "//input[@id='send']")
	WebElement CreateHoliday;
	
	public WebElement CreateHoliday() {
		return CreateHoliday;
	}
	
	@FindBy(xpath = "(//i[@class='mdi mdi-delete'])[2]")
	WebElement DeleteHoliday;
	
	public WebElement DeleteHoliday() {
		return DeleteHoliday;
	}
	
	@FindBy(xpath = "//button[contains(text(), 'Delete')]")
	WebElement CnfDeleteHoliday;
	
	public WebElement CnfDeleteHoliday() {
		return CnfDeleteHoliday;
	}

	
	
	
	
}
