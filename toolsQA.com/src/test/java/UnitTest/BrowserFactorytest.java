package UnitTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.Browserfactory;

public class BrowserFactorytest 
{
	@Test(description=" this test case verify firefox instance")
	public void testbrowser()
	{
		
		WebDriver driver =Browserfactory.getbrowser("firefox");
		Assert.assertTrue(driver!= null);
		Browserfactory.closebrowser();
	}
	
	
	@Test(description="this test case verify chrome instance")
	public void testbrowser1()
	{
		WebDriver driver =Browserfactory.getbrowser("Chrome");
		Assert.assertTrue(driver!=null);
		Browserfactory.closebrowser();
	}

}
