package test;

import org.testng.annotations.Test;

import pageobject.LoginPage1;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	  @Test
	public void login() {
		LoginPage1 l=new LoginPage1(driver);
		l.LoginDetails();
		
	  }
}
