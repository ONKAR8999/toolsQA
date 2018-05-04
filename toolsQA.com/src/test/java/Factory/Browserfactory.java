package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory 
{
	static WebDriver driver;
	public static WebDriver getbrowser(String browsername)
	{
		if(driver== null)
		{
			if(browsername.equalsIgnoreCase("Firefox"))
			{
				driver = new FirefoxDriver();
			}
			
			 if(browsername.equalsIgnoreCase("Chrome"))
			{  
				System.setProperty("webdriver.chrome.driver", DataProviderfactory.getConfig().getChromePath());
				driver = new ChromeDriver();
			}
			
			 if(browsername.equalsIgnoreCase("IE"))
			{
				 System.getProperty("webdriver.ie.driver", DataProviderfactory.getConfig().getIEpath());
				driver = new InternetExplorerDriver();
			}
		}
		
		return driver;
	}
	
	public static void closebrowser()
	{
		driver.quit();
	}

}
