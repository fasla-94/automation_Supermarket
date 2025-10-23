package supermarket7Rmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
public WebDriver driver;
	
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement addnews;
	@FindBy(xpath="//textarea[@id='news']")
	WebElement textnews;
	@FindBy(xpath="//button[@name='create']")
	WebElement savenews;
	
	public ManageNews newsAdd()
	{
		addnews.click();
		return this;
	}
	
	public ManageNews addText()
	{
		textnews.sendKeys("adfadfafasfsff");
		return this;
		
	}
	
	public ManageNews save()
	{
		savenews.click();
		return this;
	}

}
