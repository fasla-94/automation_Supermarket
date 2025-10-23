package supermarket7Rmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUser_Page {
	public WebDriver driver;
PageUtility dropdownut=new PageUtility();
	public AdminUser_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newadmin;
	@FindBy(xpath="//input[@name='username']")
	WebElement uname;
	@FindBy(xpath="//input[@name='password']")
	WebElement pword;
	@FindBy(xpath="//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[2]")
	WebElement save;
	
	
	
	public AdminUser_Page addnewadmin()
	{
		newadmin.click();
		return this;
	}
	
	public AdminUser_Page enterUsernamePassword(String username,String password)
	{	
		
		uname.sendKeys(username);
		pword.sendKeys(password);
		return this;
	}
	
	public AdminUser_Page userType(int a)
	{
		dropdownut.selectByIndex(usertype, a);
		return this;
	}
	
	public AdminUser_Page saveAdmin()
	{
		save.click();
		return this;
	}
}
