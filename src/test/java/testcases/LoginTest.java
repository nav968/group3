package testcases;



	import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;
	public class LoginTest extends TestBase {

	LoginPage LP;
DashboardPage DBP;
	@Test
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
	
}


