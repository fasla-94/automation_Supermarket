package supermarket7Rmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuperMarket {
	
	public WebDriver driver;
	
	public LoginSuperMarket(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "username")
	WebElement usernamefield;
	@FindBy(name = "password")
	WebElement passwordfield;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	WebElement signupbutton;
	
	public LoginSuperMarket provideusernamePassword(String Username,String Password)
	{
	usernamefield.sendKeys(Username);
	passwordfield.sendKeys(Password);
	return this;
	}
	public Home_Page clickSignupButton()
	{
		signupbutton.click();
		return new Home_Page(driver);
	}
}
