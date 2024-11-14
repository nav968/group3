package testcases;



	import org.testng.annotations.Test;

import pageobjects.LoginPage;
	public class LoginTest extends TestBase {

	LoginPage LP;

	@Test
	public void LoginTestValid() throws Exception {
		LP= new LoginPage(driver);
		LP.enterUsername(prop.getProperty("uname"));
		LP.enterPassword(prop.getProperty("password"));
		LP.signinClick();
	}
}


