package supermarket7Rmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterText_Page {
	
	public WebDriver driver;
	public ManageFooterText_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='btn btn-sm btn btn-primary btncss'])[1]")
	WebElement editbutton;
	@FindBy(xpath="//textarea[@id='content']")
	WebElement address;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phonenumber;
	@FindBy(xpath="//button[@name='Update']")
	WebElement update;
	
	
	public ManageFooterText_Page editAction()
	{
		editbutton.click();
		return this;
	}
	
	public ManageFooterText_Page updateAddress()
	{
		address.clear();
		address.sendKeys("azams house");
		return this;
	}
	
	public ManageFooterText_Page updateEmail()
	{
		email.clear();
		email.sendKeys("azam@gmail.com");
		return this;
	}
	
	public ManageFooterText_Page updatephone()
	{
		phonenumber.clear();
		phonenumber.sendKeys("50030717");
		return this;
	}
	
	public ManageFooterText_Page updateAction()
	{
		update.click();
		return this;
	}

}
