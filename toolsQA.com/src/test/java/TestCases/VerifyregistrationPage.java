package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.Browserfactory;
import Factory.DataProviderfactory;
import PageObjects.Registration;
import Utility.Library;


public class VerifyregistrationPage 
{
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	@Test(description="this page verify registration page")
	@Parameters("Browser")
	public void verifyregistation(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver=Browserfactory.getbrowser("firefox");
		}
		
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=Browserfactory.getbrowser("Chrome");
		}
		
	 extent = new ExtentReports("D://selenium//toolsQA.com//AdvancedReport//RegistrationError.html", true);
	 extent.config().documentTitle("toolsqa registration");
	 extent.config().reportName("Registration");
	 extent.config().reportHeadline("verifiedregistratipon page");
    logger = extent.startTest("verify registration page");
		
		
		
		
//		driver=Browserfactory.getbrowser("firefox");
		driver.get("http://demoqa.com/registration/");
		
		logger.log(LogStatus.INFO, "Application is loaded");
		
		Assert.assertTrue(driver.getTitle().contains("Registration"), "registration page is not verified");
		
		logger.log(LogStatus.PASS, "registration page is verified");
		
		String path1 = Library.captureScreenshotWithPath(driver);
		System.out.println(path1);
		logger.log(LogStatus.INFO, logger.addScreenCapture(path1));
		
		
		
		
		
	Registration register=	PageFactory.initElements(driver, Registration.class);
	
	register.typeusernmae(DataProviderfactory.getExcelconfig().getStringData(1, 0));
	register.typeLastname(DataProviderfactory.getExcelconfig().getStringData(1, 1));
	register.submit();
	String err = register.captureerrormassage();
	
	
	Assert.assertTrue(err.contains("This field  required"),"Error massage is not not varified properly ");
	
//	Browserfactory.closebrowser();
	}
	
	@AfterMethod
	public void endTestcase(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String tc_name=result.getName();
//			Library.captureScreenshotWithTC(driver, tc_name);
			
			logger.log(LogStatus.FAIL, "validation fail");
			
			logger.log(LogStatus.INFO,logger.addScreenCapture(Library.captureScreenshotWithPath(driver)));
			
//			logger.addScreenCapture(Library.captureScreenshotWithPath(driver));
			
		}
		
		extent.endTest(logger);
		extent.flush();
	}

}
