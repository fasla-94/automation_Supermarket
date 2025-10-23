package supermarket7Rmart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategory {
	WaitUtility waitutility=new WaitUtility();
	FileUploadUtility  fileuploadutility=new FileUploadUtility();
	
	public WebDriver driver;
	
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement addnew;	
	@FindBy(xpath="//input[@id='category']")
	WebElement category;
	@FindBy(xpath="//span[text()='discount']")
	WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")
	WebElement image;
	@FindBy(xpath="(//input[@name='top_menu'])[1]")
	WebElement radiobutton_topyes;
	@FindBy(xpath="(//input[@name='top_menu'])[2]")
	WebElement radiobutton_topno;
	@FindBy(xpath="(//input[@name='show_home'])[1]")
	WebElement radiobutton_showno;
	@FindBy(xpath="(//input[@name='show_home'])[2]")
	WebElement radiobutton_showyes;
	@FindBy(xpath="(//button[@name='create'])")
	WebElement save;
	
	
	public ManageCategory addNewCategory()
	{
		addnew.click();
		return this;
	}
	public ManageCategory category(String cat)
	{
		category.sendKeys(cat);
		return this;
	}
	public ManageCategory discount()
	{
		discount.click();
		return this;
	}
	public ManageCategory clickChooseFile()
	{
		fileuploadutility.sendKeysForFileUpload(image, Constant.IMGPATH);
		return this;
	}
	/*public ManageCategory radiobutton()
	{
		radiobutton_topyes.click();
		return this;
	}*/
	public ManageCategory cliksavemethod()
	{
		JavascriptExecutor click=(JavascriptExecutor) driver;
		waitutility.elementToBeClickable(driver, save);
		click.executeScript("arguments[0].click();",save);
		save.click();
		return this;
	}
}

