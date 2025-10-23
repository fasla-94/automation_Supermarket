package supermarket7Rmart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageContact {
	WaitUtility waitutility=new WaitUtility();
	public WebDriver driver;
	public ManageContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement actionbutton;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonenumber;
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	@FindBy(xpath="//textarea[@name='address']")
	WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")
	WebElement deliverytimefield;
	@FindBy(xpath="//input[@name='del_limit']")
	WebElement deliverychargefield;
	@FindBy(xpath="//button[@name='Update']")
	WebElement update;
	
	public ManageContact action()
	{
		actionbutton.click();
		return this;
	}
	public ManageContact updatePhone()
	{	
		phonenumber.clear();
		phonenumber.sendKeys("98765432210");
		return this;
	}
	public ManageContact updatemail()
	{
		email.clear();
		email.sendKeys("asfa@gmail.com");
		return this;
	}
	
	public ManageContact updateAddress()
	{
		address.clear();
		address.sendKeys("azams home");
		return this;
		
	}
	public ManageContact deliverytime() 
	{
		deliverytimefield.clear();
		deliverytimefield.sendKeys("21");
		return this;
	}
	public ManageContact deliverychargelimit()
	{
		deliverychargefield.clear();
		deliverychargefield.sendKeys("200");
		return this;
	}
	public ManageContact updatebutton()
	{
		JavascriptExecutor click=(JavascriptExecutor) driver;
	    waitutility.elementToBeClickable(driver,update);
	    click.executeScript("arguments[0].click();",update);
	    update.click();
		return this;
	}

}
