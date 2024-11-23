package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.VisitLogsPage;

public class DashboardTest extends TestBase {
	LoginPage LP;
	DashboardPage DBP;
	VisitLogsPage VLP;
	
    

	@Test
	public void addcontactperson() throws Exception {
		LP= new LoginPage(driver);
		DBP = new DashboardPage(driver);
		VLP = new VisitLogsPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LP.enterUsername(prop.getProperty("uname"));
		LP.enterPassword(prop.getProperty("password"));
		LP.signinClick();
		DBP.addNewVisit();
		DBP.instiDropDown(prop.getProperty("options"));
		DBP.addContactPerson();
		DBP.nameField("JOHN DOEEEzy");
		DBP.designation(prop.getProperty("designation"));
		DBP.email("johnwickz23@gmail.com");
		DBP.phone(prop.getProperty("number"));
		DBP.submitbutton();
		DBP.contactPersonclose();
	DBP.addEmp("Manager 1");
		DBP.addDate("15-11-2024 14:50");
		DBP.purpose("Test");
		DBP.contact("Amal (lecture)");
		DBP.addNote("testing");
		//obj.disc();
		DBP.submit();
		}
}
