package test_7RMartSuperMarket;

import java.io.IOException;

import org.testng.annotations.Test;

import supermarket7Rmart.Home_Page;
import supermarket7Rmart.LoginSuperMarket;
import supermarket7Rmart.ManageContact;
import supermarket7Rmart.ManageFooterText_Page;
import utilities.ExcelUtility;

public class ManageFooter_Test extends Base_Test {
	Home_Page home;
	ManageFooterText_Page footer;
  @Test
  public void manageFooterInformation() throws Exception {
	  LoginSuperMarket login=new LoginSuperMarket(driver);
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage_Test");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage_Test");
	  login.provideusernamePassword(username, password);
	  home=login.clickSignupButton();
	  footer=home.morefootertextinfo();
	  footer.editAction();
	  footer.updateAddress().updateEmail().updatephone().updateAction();
	  
  }
}
