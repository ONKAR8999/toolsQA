package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Factory.Browserfactory;

public class loginMultiuser
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
	
	Object[][] arr = new Object[2][2];
	
	arr[0][0] = "data@gmail.com";
	arr[0][1] = "rajesh";
	arr[1][0] = "data@gmail11.com";
	arr[1][1] = "data@gm.com";
	
	System.out.println("data created successfully");
	
	return arr;
}

@AfterTest
public void tearDown()
{
	Browserfactory.closebrowser();
	
}

}

