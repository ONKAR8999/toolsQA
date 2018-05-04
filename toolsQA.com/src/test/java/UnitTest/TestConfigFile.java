package UnitTest;

import org.testng.annotations.Test;

import DataProvider.ReadConfig;

public class TestConfigFile 
{
	 
	@Test
	public void testconfig()
	{
		ReadConfig readconfig = new ReadConfig();
		
	String ie_pth=	readconfig.getIEpath();
	
	System.out.println("IE driver is located at"+ie_pth);
	}

	@Test
	public void testconfig1()
	{
		ReadConfig readconfig = new ReadConfig();
		
	String chrome_pth=	readconfig.getChromePath();
	
	System.out.println("Chrome driver is located at"+chrome_pth);
	}
}
