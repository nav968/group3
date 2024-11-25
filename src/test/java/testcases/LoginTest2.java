package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LoginPage2;

public class LoginTest2 extends TestBase {
	LoginPage2 LP2;
	@ BeforeTest
		public void setup() {
		LP2=new LoginPage2(driver);
	}
	//valid username and password
		@Test(priority = 1)
		
		public void poslogin() {
		LP2=new LoginPage2(driver);	
		LP2.enterusername(prop.getProperty("uname2"));
		LP2.enterpassword(prop.getProperty("pass2"));
		LP2.signinclick();
	  }
	//valid username and invalid password
		@Test(priority = 2)
		public void neglogin(){
		
			LP2=new LoginPage2(driver);
			LP2.enterusername(prop.getProperty("uname2"));
			LP2.enterpassword(prop.getProperty("password"));
			LP2.signinclick();
		}
	//invalid username and valid password
		@Test(priority = 3)
		public void neglogin1()
		{
			LP2=new LoginPage2(driver);
			LP2.enterusername(prop.getProperty("user"));
			LP2.enterpassword(prop.getProperty("pass2"));
			LP2.signinclick();
		}
	//valid username and blank password
		@Test(priority = 4)
		public void neglogin2()
		{
			LP2=new LoginPage2(driver);
			LP2.enterusername(prop.getProperty("uname2"));
			LP2.enterpassword(prop.getProperty("word"));
			LP2.signinclick();
		}
	//blank username and password
		@Test(priority = 5)
		public void neglogin3()
		{
			LP2=new LoginPage2(driver);
			LP2.enterusername(prop.getProperty("userid"));
			LP2.enterpassword(prop.getProperty("word"));
			LP2.signinclick();
		}
	//blank username and valid password
		@Test(priority = 6)
		public void neglogin4() {
			LP2=new LoginPage2(driver);
			LP2.enterusername(prop.getProperty("userid"));
			LP2.enterpassword(prop.getProperty("pass2"));
			LP2.signinclick();	
		}
		@Test(priority =7 )
		public void verifyelements() throws Exception {
			LP2=new LoginPage2(driver);
			LP2.verifyelement();
		}
}
