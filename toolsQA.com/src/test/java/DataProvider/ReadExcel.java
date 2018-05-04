package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	XSSFWorkbook wb;
	XSSFSheet wsh1;
	public ReadExcel()
	{
		try 
		{
			File src = new File("./ApplicationTestdata/data.xlsx");
			
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);
			 wsh1= wb.getSheetAt(0);
			 System.out.println("Excel file is loaded");
		} catch (FileNotFoundException e)
		{
			System.out.println("File is not found at the location");
			System.out.println(e.getMessage());
		
		} catch (IOException e) 
		{
			System.out.println("file is not read");
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	public String getStringData(int row,int column)
	{
		String data=wsh1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public double getNumeriData(int row , int column)
	{
		double data = wsh1.getRow(row).getCell(column).getNumericCellValue();
	    return data;
	}
	
	public int getRows() 
	{
		int rows=wsh1.getLastRowNum();
		
		return rows;
	}

}
