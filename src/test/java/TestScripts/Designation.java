package TestScripts;

import static org.testng.Assert.*;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pomClasses.DesignationPOM;
import pomClasses.LoginLogoutPOM;
import utilClasses.BaseClass;
import utilClasses.ExcelClass;
import utilClasses.Listners;
@Listeners(Listners.class)

public class Designation extends BaseClass {
	 	
		LoginLogoutPOM log;
		DesignationPOM designation;
		
	
	     @Test(priority = 0)
	     public void AddDesignation() throws Throwable {
	    	 designation = new DesignationPOM(driver);
	 		 log = new LoginLogoutPOM(driver);
	    	 wait.until(ExpectedConditions.elementToBeClickable(designation.master()));

	    	 
	 			// Verify HomePage Title
		        Assert.assertEquals(log.DashboardModule().isDisplayed(),true ,"HomePage Title does not match");
		        System.out.println("HomePage Title Verified");

		        designation.master().click();
		        
		        wait.until(ExpectedConditions.elementToBeClickable(designation.DesignationsModule())).click();
		        
				// Verify Designation Page Title
		        wait.until(ExpectedConditions.elementToBeClickable(designation.AddDesignation()));
		        Assert.assertEquals(designation.AddDesignation().isDisplayed(),true ,"Designation Page Title does not match");
		        System.out.println("Designation Page Title Verified");
		        designation.AddDesignation().click();
		        
		        wait.until(ExpectedConditions.visibilityOf(designation.DesignationName()));
		        designation.DesignationName().sendKeys(excel.InputData("Sheet1", 2, 2));
		        
		        designation.CreateDesignation().click();
	     }
	     
	     @Test(priority = 1, dependsOnMethods = "AddDesignation")
	     public void UpdateDesignation() throws Exception {
	    	 
	    	 wait.until(ExpectedConditions.invisibilityOf(designation.DesignationName()));
	    	 designation.ActionButton().click();
	    	 
	    	 wait.until(ExpectedConditions.visibilityOf(designation.DesignationName())).clear();
	    	 designation.DesignationName().sendKeys(excel.InputData("Sheet1", 2, 1));
	    	 
	    	 designation.CreateDesignation().click();
	    	 wait.until(ExpectedConditions.invisibilityOf(designation.DesignationName()));

	     }     
	     
}
