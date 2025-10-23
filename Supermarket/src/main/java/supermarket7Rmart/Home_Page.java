package supermarket7Rmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory	.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@class='img-circle']")
	WebElement admin;
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]")
	WebElement logout;
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]")
	WebElement moreinfo;
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]")
	WebElement categorymoreinfo;
	@FindBy(xpath="(//a[@class='small-box-footer'])[7]")
	WebElement categorymorenews;
	@FindBy(xpath="(//a[@class='small-box-footer'])[3]")
	WebElement managecontactmoreinfo;
	@FindBy(xpath="(//a[@class='small-box-footer'])[8]")
	WebElement morefooterinfo;
	
	public ManageFooterText_Page morefootertextinfo()
	{
		morefooterinfo.click();
		return new ManageFooterText_Page(driver);
		
		
	}
	public ManageContact morecontact()
	{
		managecontactmoreinfo.click();
		return new ManageContact(driver);
	}
	public ManageNews morenews()
	{
		categorymorenews.click();
		return new ManageNews(driver);
	}
	
	public ManageCategory moreinfocat()
	{
		categorymoreinfo.click();
		return new ManageCategory(driver);
	}
	
	public AdminUser_Page clickMoreInfo()
	{
		moreinfo.click();
		return new AdminUser_Page(driver);
		
	}
	
	public Home_Page selectAdmin()
	{
		admin.click();
		return this;
	}
	
	public Home_Page clickOnLogout()
	{
		logout.click();
		return this;
	}
	

}
