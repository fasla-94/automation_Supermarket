package test_7RMartSuperMarket;

import java.io.IOException;

import org.testng.annotations.Test;

import supermarket7Rmart.Home_Page;
import supermarket7Rmart.LoginSuperMarket;
import supermarket7Rmart.ManageContact;
import utilities.ExcelUtility;

public class ManageContact_Test extends Base_Test{
	
	Home_Page home;
	ManageContact contact;
  @Test
  public void updateContactusInfo() throws Exception {
	  LoginSuperMarket login=new LoginSuperMarket(driver);
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage_Test");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage_Test");
	  login.provideusernamePassword(username, password);
	  home=login.clickSignupButton();
	  contact=home.morecontact();
	  contact.action();
	  contact.updatePhone().updatemail().updateAddress().deliverytime().deliverychargelimit().updatebutton();
  }
}
