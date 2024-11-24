package testcases;

import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.VisitLogsPage;

public class VisitLogTest extends TestBase {
		LoginPage LP;
		DashboardPage DBP;
		VisitLogsPage VLP;
		
		@Test
		public void followupbutton() throws Exception {
			LP = new LoginPage(driver);
			DBP= new DashboardPage(driver);
			VLP = new VisitLogsPage(driver);
			LP.enterUsername(prop.getProperty("uname"));
			LP.enterPassword(prop.getProperty("password"));
			LP.signinClick();
			VLP.visitlog();
			VLP.followup();
			VLP.actiondetail();
			VLP.actiondescription();
			VLP.actiondate();
			VLP.statusdropdown("Completed");
			VLP.submitfollowup();
			VLP.cancelbutton();
		}
		

}
