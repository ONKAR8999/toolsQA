package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.DataProviderfactory;

public class DataProviderFactoryTest
{
	@Test
	public static void testconfig()
	{
		String chrome_path=DataProviderfactory.getConfig().getChromePath();
		Assert.assertEquals(chrome_path, "C:\\Users\\SAGAR\\Downloads\\Compressed\\chromedriver.exe");
	}

	@Test
	public static void testexcel()
	{
		String data=DataProviderfactory.getExcelconfig().getStringData(0	, 0);
		Assert.assertEquals(data, "toolqa");
	}

}
