package test_7RMartSuperMarket;

import java.io.IOException;

import org.testng.annotations.Test;

import supermarket7Rmart.AdminUserSearch;
import supermarket7Rmart.AdminUser_Page;
import supermarket7Rmart.LoginSuperMarket;
import utilities.ExcelUtility;

public class AdminUserSearchPage_Test extends Base_Test {
  @Test(retryAnalyzer = retry.Retry_class.class)
  public void searchAdminUsers() throws IOException {
	  LoginSuperMarket login=new LoginSuperMarket(driver);
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage_Test");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage_Test");
	  login.provideusernamePassword(username, password);
	  login.clickSignupButton();
	  AdminUser_Page adminuser=new AdminUser_Page(driver);
	  //adminuser.clickMoreInfo();
	  AdminUserSearch adminsearch=new AdminUserSearch(driver);
	  adminsearch.searchOption();
	  adminsearch.enterUsername("Aizam");
	  adminsearch.selectUser(2);
	  adminsearch.clickSearch();
	  
  }
}

