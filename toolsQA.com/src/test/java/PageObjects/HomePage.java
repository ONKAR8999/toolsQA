package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage
{
	
	@FindBy(how=How.XPATH, using=".//a[text()='Registration']")
			WebElement registration;
	
	
//	@FindBy(xpath=".//a[text()='Registration']")
//	WebElement registratn;
			
	public void clickonRegistrataionLink()
	{
		registration.click();
	}
	
	
	
	public boolean isDisplayLink()
	{
		boolean link_status=registration.isDisplayed();
		return link_status;
	}
	
	public boolean isenabledlink()
	{
		boolean link_stts=registration.isEnabled();
		return link_stts;
	}

}
