package test_7RMartSuperMarket;

import org.testng.annotations.Test;

import supermarket7Rmart.Home_Page;
import supermarket7Rmart.LoginSuperMarket;

public class HomePage_Test extends Base_Test{
	Home_Page home;
  @Test
  public void verifyLogout() 
  {
	  LoginSuperMarket verfiylogin= new LoginSuperMarket(driver);
	  verfiylogin.provideusernamePassword("admin", "admin");
	  home=verfiylogin.clickSignupButton();
	  home.selectAdmin().clickOnLogout();
	  /*verfiylogin.clickSignupButton();
	  Home_Page admin=new Home_Page(driver);
	  admin.selectAdmin();
	  admin.clickOnLogout();
	  */
  }
}
