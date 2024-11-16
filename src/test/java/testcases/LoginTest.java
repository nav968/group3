package testcases;



	import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;
	public class LoginTest extends TestBase {

	LoginPage LP;
DashboardPage DBP;

	@Test(priority = 1)
	public void LoginTestValid() throws Exception {
		LP= new LoginPage(driver);
		DBP= new DashboardPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LP.enterUsername(prop.getProperty("uname"));
		LP.enterPassword(prop.getProperty("password"));
		LP.signinClick();
		String url = DBP.getdashboardpageurl();
		Assert.assertEquals(url,"https://dev.visit.ictkerala.org/homepage");
    
		System.out.println("done");
	System.out.println("passed");
		

	}
	//valid username and invalid password
		@Test(priority = 2)
		public void neglogin(){
		
			LP=new LoginPage(driver);
			LP.enterUsername(prop.getProperty("uname"));
			LP.enterPassword(prop.getProperty("password1"));
			LP.signinClick();
		}
	//invalid username and valid password
		@Test(priority = 3)
		public void neglogin1()
		{
			LP=new LoginPage(driver);
			LP.enterUsername(prop.getProperty("user"));
			LP.enterPassword(prop.getProperty("password"));
			LP.signinClick();
		}
	//valid username and blank password
		@Test(priority = 4)
		public void neglogin2()
		{
			LP=new LoginPage(driver);
			LP.enterUsername(prop.getProperty("uname"));
			LP.enterPassword(prop.getProperty("word"));
			LP.signinClick();
		}
	//blank username and password
		@Test(priority = 5)
		public void neglogin3()
		{
			LP=new LoginPage(driver);
			LP.enterUsername(prop.getProperty("userid"));
			LP.enterPassword(prop.getProperty("word"));
			LP.signinClick();
		}
	//blank username and valid password
		@Test(priority = 6)
		public void neglogin4() {
			LP=new LoginPage(driver);
			LP.enterUsername(prop.getProperty("userid"));
			LP.enterPassword(prop.getProperty("password"));
			LP.signinClick();	
		}
		@Test(priority =7 )
		public void verifyelements() throws Exception {
			LP=new LoginPage(driver);
			LP.verifyelement();
		}
}


