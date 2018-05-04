package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Library 
{
	
	public static void captureScreenshot(WebDriver Idriver)
	{
		TakesScreenshot ts = (TakesScreenshot)Idriver;
		
		File Screen_sc=ts.getScreenshotAs(OutputType.FILE);
		
		String Path ="D://selenium//toolsQA.com//Screenshots//"+System.currentTimeMillis()+".png";
		
		File destination = new File(Path);
		
		try {
			FileUtils.copyFile(Screen_sc, destination);
		} catch (IOException e) 
		{
			
			System.out.println("IO exception"+e.getMessage());
		}
		
		

	}
	public static void captureScreenshotWithTC(WebDriver Idriver,String tc_name)
	{
		TakesScreenshot ts = (TakesScreenshot)Idriver;
		
		File Screen_sc=ts.getScreenshotAs(OutputType.FILE);
		
		String Path ="./Screenshots/"+tc_name+".png";
		
		File destination = new File(Path);
		
		try {
			FileUtils.copyFile(Screen_sc, destination);
		} catch (IOException e) 
		{
			
			System.out.println("IO exception"+e.getMessage());
		}
		
		

	}
	
	public static String captureScreenshotWithPath(WebDriver Idriver)
	{
		TakesScreenshot ts = (TakesScreenshot)Idriver;
		
		File Screen_sc=ts.getScreenshotAs(OutputType.FILE);
		
		String destination ="D://selenium//toolsQA.com//Screenshots "+System.currentTimeMillis()+".png";
		
//		File destination = new File(Path);
		
		try {
			FileUtils.copyFile(Screen_sc,new File( destination));
		} catch (IOException e) 
		{
			
			System.out.println("IO exception"+e.getMessage());
		}
		return destination;
	}
		
		


}
