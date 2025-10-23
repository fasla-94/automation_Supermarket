package test_7RMartSuperMarket;

import java.io.IOException;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import supermarket7Rmart.AdminUser_Page;
import supermarket7Rmart.Home_Page;
import supermarket7Rmart.LoginSuperMarket;
import utilities.ExcelUtility;
import utilities.FakeUtility;

public class AdminUserPage_Test extends Base_Test {
	Home_Page home;
	AdminUser_Page adminuser;
	FakeUtility fake=new FakeUtility(); 
  @Test
  public void moreInfo() throws IOException 
  {
	  LoginSuperMarket verfiylogin= new LoginSuperMarket(driver);
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage_Test");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage_Test");
	  verfiylogin.provideusernamePassword(username, password);
	  home=verfiylogin.clickSignupButton();
	  adminuser=home.clickMoreInfo();
	  String fakeusername=fake.firstName();
	  String fakepassword=fake.password();
	  adminuser.addnewadmin().enterUsernamePassword(fakeusername, fakepassword).userType(1).saveAdmin();
	 
	  /*verfiylogin.clickSignupButton();
	  AdminUser_Page home=new AdminUser_Page(driver);
	  home.clickMoreInfo();
	  home.addnewadmin();
	  String username1=ExcelUtility.getStringData(1, 0, "NewAdminUser");
	  String password1=ExcelUtility.getStringData(1, 1, "NewAdminUser");
	  home.enterUsernamePassword(username1,password1);
	  home.userType(2);
	  home.saveAdmin();*/
  }
  
  
}
