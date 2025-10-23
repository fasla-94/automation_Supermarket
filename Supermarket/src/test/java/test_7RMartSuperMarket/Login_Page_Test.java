package test_7RMartSuperMarket;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supermarket7Rmart.Home_Page;
import supermarket7Rmart.LoginSuperMarket;
import utilities.ExcelUtility;

public class Login_Page_Test extends Base_Test {
	
	Home_Page home;
  @Test(dataProvider = "usercredentials",groups="smoketest")
  public void verifyValidUserCredentials(String Username,String password)
	{
		LoginSuperMarket logincredentials=new LoginSuperMarket(driver);
		logincredentials.provideusernamePassword(Username, password);
		logincredentials.clickSignupButton();
		
	}
  @Test
  @Parameters({"Username","password"})
  public void verifyCorrectUsernameIncorrectPassword(String Username, String password)
 	{
 		LoginSuperMarket logincredentials=new LoginSuperMarket(driver);
 		logincredentials.provideusernamePassword(Username,password);
 		logincredentials.clickSignupButton();
 		
 	}
  
  @Test
  public void verifyInCorrectUsernamecorrectPassword() throws IOException
 	{
 		LoginSuperMarket logincredentials=new LoginSuperMarket(driver);
 		String username=ExcelUtility.getStringData(1, 0, "LoginPage_Test");
 		String password=ExcelUtility.getStringData(1, 1, "LoginPage_Test");
 		logincredentials.provideusernamePassword(username,password);
 		logincredentials.clickSignupButton();
 		
 	}
 @Test(groups="smoketest")
  public void verifyInCorrectUsernameIncorrectPassword() throws IOException
 	{
 		LoginSuperMarket logincredentials=new LoginSuperMarket(driver);
 		String username=ExcelUtility.getStringData(2, 0, "LoginPage_Test");
 		String password=ExcelUtility.getStringData(2, 1, "LoginPage_Test");
 		logincredentials.provideusernamePassword(username,password);
 		home=logincredentials.clickSignupButton(); //method is in login but returned to home page thats y we call as home=
 		//logincredentials.clickSignupButton();
 	}
 
 @DataProvider(name="usercredentials")
 public Object[][] testData()
 {
 Object data[][] = {
		  {"admin","admin"},{"admin1","123456"},{"adm","admin"},{"fsfs","432"} };
		           
 return data;
 }
}