package dataDriven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Factory.Browserfactory;
import Factory.DataProviderfactory;

public class loginMultiuserwithExcel
{
	WebDriver driver;
	
	
    @BeforeTest
	public void setup()
	{
    driver=	Browserfactory.getbrowser("firefox");
    
    driver.manage().window().maximize();
    driver.get("http://demoqa.com/registration/");	
		
	}
    
    
   @Test(dataProvider="logins")
public void multiuser(String fname, String lname )
{
	
	driver.findElement(By.id("name_3_firstname")).clear();
	driver.findElement(By.id("name_3_firstname")).sendKeys(fname);
	driver.findElement(By.id("name_3_lastname")).clear();
	driver.findElement(By.id("name_3_lastname")).sendKeys(lname);
}


@DataProvider(name="logins")
public Object[][]getData()
{
	
	System.out.println("data provider started");
	
	int rows=DataProviderfactory.getExcelconfig().getRows();
	
	Object[][] arr = new Object[rows][2];
	
	for(int i=0;i<rows;i++)
	{
		
	arr [i] [0]=DataProviderfactory.getExcelconfig().getStringData(i, 0);
	
	arr[i][1]= DataProviderfactory.getExcelconfig().getStringData(i, 1);
	}
	System.out.println("data created successfully");
	
	return arr;
}

@AfterTest
public void tearDown()
{
	Browserfactory.closebrowser();
	
}

}

