package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadConfig

{
	Properties pro;
	
	public  ReadConfig()
	{
		try {
			File src = new File("./configuration/config.properties");
			
			FileInputStream fis = new FileInputStream(src);
			 pro=new Properties();
			
			pro.load(fis);
			System.out.println("config file is loaded");
		} catch (FileNotFoundException e) 
		
		{
			System.out.println("file is not found check the file location");
			System.out.println(e.getMessage());
			
		} catch (IOException e) 
		{
			System.out.println("Exception while Reading");
			System.out.println(e.getMessage());
			
		}
		
		}
	
	
	
	public List<String> getxmlfiles()
	{
		  String xmlFiles =pro.getProperty("TestXMLFiles");
		  
		 String[] arr = xmlFiles.split(",");
		 
		 List<String> list = new ArrayList<String>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 list.add(arr[i]);
		 }
		return list;
		 }
	
	
	
	
	
	
	
	
	public String getChromePath()
	{
		
		String chrome_path=pro.getProperty("ChromePath");
		
		return chrome_path;
	}
	
	public String getIEpath()
	{
		
		String IE_path=pro.getProperty("IEPath");
		
		return IE_path;
	}

}
