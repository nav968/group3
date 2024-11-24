package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;

public class DashboardTest extends TestBase {
	LoginPage LP;
	DashboardPage DBP;

	@Test
	public void addcontactperson() throws Exception {
		LP= new LoginPage(driver);
		DBP = new DashboardPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LP.enterUsername(prop.getProperty("uname"));
		LP.enterPassword(prop.getProperty("password"));
		LP.signinClick();
		DBP.addNewVisit();
		DBP.instiDropDown(prop.getProperty("options"));
		DBP.addContactPerson();
		DBP.nameField(prop.getProperty("name"));
		DBP.designation(prop.getProperty("designation"));
		DBP.email(prop.getProperty("mail"));
		DBP.phone(prop.getProperty("number"));
		DBP.submitbutton();
		DBP.contactPersonclose();
	DBP.addEmp(prop.getProperty("employee"));
		DBP.addDate("15-11-2024 14:50");
		DBP.purpose(prop.getProperty("purpose"));
		DBP.contact("Dev R (contract)");
		DBP.addNote("testing");
		DBP.submit();
		DBP.closeAddvisit();
		}
}
