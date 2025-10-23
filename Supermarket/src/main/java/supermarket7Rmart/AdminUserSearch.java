package supermarket7Rmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserSearch {
	
	public WebDriver driver;
	
	public AdminUserSearch(WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath="//input[@name='un']")
	WebElement uname;
	@FindBy(xpath="//select[@id='ut']")
	WebElement type;
	@FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[1]")
	WebElement searchbutton;
	
	public void searchOption()
	{
		search.click();
	}
	
	public void enterUsername(String name)
	{
		uname.sendKeys(name);
	}
	
	public void selectUser(int index)
	{
		Select select=new Select(type);
		select.selectByIndex(index);
	}
	
	public void clickSearch()
	{
		searchbutton.click();
	}

}
