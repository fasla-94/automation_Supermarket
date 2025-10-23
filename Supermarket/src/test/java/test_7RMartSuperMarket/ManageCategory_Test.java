package test_7RMartSuperMarket;

import java.io.IOException;

import org.testng.annotations.Test;

import constant.Constant;
import supermarket7Rmart.Home_Page;
import supermarket7Rmart.LoginSuperMarket;
import supermarket7Rmart.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategory_Test extends Base_Test {
	
	Home_Page home;
	ManageCategory managecat;
  @Test
  public void manageCategory() throws Exception {
	  LoginSuperMarket login=new LoginSuperMarket(driver);
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage_Test");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage_Test");
	  login.provideusernamePassword(username, password);
	  String cat=ExcelUtility.getStringData(1, 0, "Category");
	  home=login.clickSignupButton();
	  //login.clickSignupButton();
	  managecat=home.moreinfocat();
	  managecat.addNewCategory().category(cat).discount().clickChooseFile().cliksavemethod();
	 /* ManageCategory categorymanage=new ManageCategory(driver);
	  categorymanage.moreinfocat();
	  categorymanage.addNewCategory();
	 
	  categorymanage.category(cat);
	  categorymanage.discount();
	  categorymanage.clickChooseFile();
	  categorymanage.cliksavemethod();*/
	  
			  }
}
