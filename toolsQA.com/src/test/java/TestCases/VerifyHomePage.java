package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Factory.Browserfactory;
import PageObjects.HomePage;
import Utility.Library;


public class VerifyHomePage 
{
	WebDriver driver;
	@Test(description="This test checking home page link")
	public void verifyHomePage()
	{
		
		 driver= Browserfactory.getbrowser("firefox");
		 
		 driver.get("http://demoqa.com/");
		 Assert.assertTrue(driver.getTitle().contains("Dmoqa"), "HomePage is not verified");
	
		 
//		 WebDriverWait wait = new WebDriverWait(driver, 5)	;
//		 
//		 wait.until(ExpectedConditions.elementToBeClickable(element)))
	
	HomePage homepage= 	PageFactory.initElements(driver, HomePage.class);
	
	if(homepage.isenabledlink()&&homepage.isDisplayLink())
	{
		homepage.clickonRegistrataionLink(); 
	}
	
	
	//Browserfactory.closebrowser();
	}
	
	@AfterMethod
	public void endTestcase(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Library.captureScreenshot(driver);
		}
	}

}
