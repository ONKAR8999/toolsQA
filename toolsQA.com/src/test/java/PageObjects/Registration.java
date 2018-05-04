package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration 
{
	@FindBy(id="name_3_firstname")
	WebElement firstname;
	
	@FindBy(id="name_3_lastname")
	WebElement lastname;
	
	@FindBy(xpath=".//input[@value='Submit']")
	WebElement submitButton;
	
//	@FindBy(xpath=".//span[@class='legend error']/preceding::span[5]")
	@FindBy(xpath=".//*[@id='pie_register']/li[3]/div/div[2]/span")
	WebElement errormassage;
	
	public void typeusernmae(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	
	public void typeLastname(String lname)
	{
		lastname.sendKeys(lname);
	}

	public void submit()
	{
		submitButton.click();
	}
	
	public String captureerrormassage()
	{
	String error=errormassage.getText();
	return error;
		
	}
}
