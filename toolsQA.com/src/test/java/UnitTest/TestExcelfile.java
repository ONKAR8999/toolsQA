package UnitTest;

import org.testng.annotations.Test;

import DataProvider.ReadExcel;

public class TestExcelfile 
{
	@Test
	public void testexcel()
	{
		ReadExcel readexcel = new ReadExcel();
		
		String Output=readexcel.getStringData(0, 0);
		
		System.out.println("data output from Excelsheet "+Output);
	}
	
	@Test
	public void testexcel1()
	{
		ReadExcel readexcel = new ReadExcel();
		
		double Output=readexcel.getNumeriData(2, 0);
		
		System.out.println("data output from Excelsheet "+Output);
	}

}
