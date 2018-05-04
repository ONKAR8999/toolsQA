package Factory;

import DataProvider.ReadConfig;
import DataProvider.ReadExcel;

public class DataProviderfactory 
{
	
	static ReadConfig config;
	
	static ReadExcel excelconfig;
	
	public static ReadConfig getConfig()
	{
		if(config==null)
			
		{
			config = new ReadConfig();
		}
		return config;
	}
	
	
	public static ReadExcel getExcelconfig()
	{
		if(excelconfig==null)
		{
			excelconfig= new ReadExcel();
		}
		return excelconfig; 
	}
	
	
	
	

}
