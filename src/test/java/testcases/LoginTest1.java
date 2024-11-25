package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LoginPage1;

public class LoginTest1 extends TestBase {
	LoginPage1 LP1;
	@ BeforeTest
		public void setup() {
		LP1=new LoginPage1(driver);
	}
	//valid username and password
		@Test(priority = 1)
		
		public void poslogin() {
		LP1=new LoginPage1(driver);	
		LP1.enterusername(prop.getProperty("uname1"));
		LP1.enterpassword(prop.getProperty("pass1"));
		LP1.signinclick();
	  }
	//valid username and invalid password
		@Test(priority = 2)
		public void neglogin(){
		
			LP1=new LoginPage1(driver);
			LP1.enterusername(prop.getProperty("uname1"));
			LP1.enterpassword(prop.getProperty("password"));
			LP1.signinclick();
		}
	//invalid username and valid password
		@Test(priority = 3)
		public void neglogin1()
		{
			LP1=new LoginPage1(driver);
			LP1.enterusername(prop.getProperty("user"));
			LP1.enterpassword(prop.getProperty("pass1"));
			LP1.signinclick();
		}
	//valid username and blank password
		@Test(priority = 4)
		public void neglogin2()
		{
			LP1=new LoginPage1(driver);
			LP1.enterusername(prop.getProperty("uname1"));
			LP1.enterpassword(prop.getProperty("word"));
			LP1.signinclick();
		}
	//blank username and password
		@Test(priority = 5)
		public void neglogin3()
		{
			LP1=new LoginPage1(driver);
			LP1.enterusername(prop.getProperty("userid"));
			LP1.enterpassword(prop.getProperty("word"));
			LP1.signinclick();
		}
	//blank username and valid password
		@Test(priority = 6)
		public void neglogin4() {
			LP1=new LoginPage1(driver);
			LP1.enterusername(prop.getProperty("userid"));
			LP1.enterpassword(prop.getProperty("pass1"));
			LP1.signinclick();	
		}
		@Test(priority =7 )
		public void verifyelements() throws Exception {
			LP1=new LoginPage1(driver);
			LP1.verifyelement();
		}
}
