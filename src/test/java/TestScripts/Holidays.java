package TestScripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;

import pomClasses.HolidaysPOM;
import pomClasses.LoginLogoutPOM;
import utilClasses.BaseClass;

public class Holidays extends BaseClass {
	HolidaysPOM holiday;
	LoginLogoutPOM log;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     
	public void clickNextButtonFourTimes() {
		for (int i = 0; i < 3; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(holiday.Nextbutton()));
            holiday.Nextbutton().click();
        }
	}
	@Test(priority = 0)
	public void Addholiday() throws InterruptedException {
		holiday = new HolidaysPOM(driver);
		log = new LoginLogoutPOM(driver);
		
        wait.until(ExpectedConditions.elementToBeClickable(holiday.master()));

		// Verify HomePage Title
	    Assert.assertEquals(log.DashboardModule().isDisplayed(),true ,"HomePage Page Title does not match");
	    System.out.println("HomePage Title Verified");
	        		
		holiday.master().click();
		
        wait.until(ExpectedConditions.elementToBeClickable(holiday.HolidaysModule()));
		holiday.HolidaysModule().click();
		
		// Verify Holidays Page Title
        wait.until(ExpectedConditions.elementToBeClickable(holiday.AddHoliday()));
        Assert.assertEquals(holiday.AddHoliday().isDisplayed(),true ,"Holidays Page Title does not match");
        System.out.println("Holidays Page Title Verified");
		holiday.AddHoliday().click();
		
        wait.until(ExpectedConditions.elementToBeClickable(holiday.fromdate()));
		holiday.fromdate().click();
		
		clickNextButtonFourTimes();
		
        wait.until(ExpectedConditions.elementToBeClickable(holiday.HolidayDate()));
		holiday.HolidayDate().click();
		
		holiday.todate().click();
		
		clickNextButtonFourTimes();
		
		holiday.HolidayDate().click();
		
		holiday.HolidayName().sendKeys("Independence Day");
		
		holiday.CreateHoliday().click();
		
	}
	
	@Test(priority = 1, dependsOnMethods = "Addholiday")
	public void DeleteHoliday() {
		
        wait.until(ExpectedConditions.elementToBeClickable(holiday.DeleteHoliday()));
		holiday.DeleteHoliday().click();
		
        wait.until(ExpectedConditions.elementToBeClickable(holiday.CnfDeleteHoliday()));
		holiday.CnfDeleteHoliday().click();
		
	}
		
}
